package nikif;

import nikif.models.WeatherInfo;
import nikif.models.parse.ApiResponse;
import nikif.models.parse.DailySummary;
import nikif.repositories.WeatherInfoRepository;
import nikif.services.HttpRequestService;
import nikif.services.JsonDeserializerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * Main Class of the spring boot application responsible for bootstrapping the tomcat
 * along with the application.
 */
@SpringBootApplication
public class DemoApplication {

	@Autowired
	private HttpRequestService httpRequestService;

	@Autowired
	private WeatherInfoRepository weatherInfoRepository;

	@Autowired
	private JsonDeserializerService jsonDeserializerService;

	@Value("${api.default.key}")
	private String apiKey;

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() throws Exception {
		return args -> {

			logger.info("Welcome to the demo !!");

			/* First Way : getForObject parses the object */
			// ApiResponse apiResponse = httpRequestService.getWundergroundDataAsObject(apiKey, "20171030", "NY", "New_York.json");

			/* Second Way : we use a service to deserialize the json object */
			String apiResponseString = httpRequestService.getWundergroundDataAsString(apiKey, "20171030", "NY", "New_York.json");
			ApiResponse apiResponse = jsonDeserializerService.deserializeApiResponse(apiResponseString);

			if (apiResponse != null && apiResponse.getHistory() != null
					&& apiResponse.getHistory().getDailysummary() != null
					&& !apiResponse.getHistory().getDailysummary().isEmpty()) {

				List<DailySummary> list  = apiResponse.getHistory().getDailysummary();

				DailySummary dailySummary = list.get(0);
				logger.info("Max Humidity: " + dailySummary.getMaxhumidity());
				logger.info("Max temperature: " + dailySummary.getMaxtempm());
				logger.info("Min temperature : " + dailySummary.getMintempm());
				logger.info("Precipitation: " + dailySummary.getPrecipm());

				WeatherInfo weatherInfo = new WeatherInfo();
				weatherInfo.setMaxHumidity(dailySummary.getMaxhumidity());
				weatherInfo.setMaxtempm(dailySummary.getMaxtempm());
				weatherInfo.setMintempm(dailySummary.getMintempm());
				weatherInfo.setPrecipm(dailySummary.getPrecipm());

				weatherInfoRepository.save(weatherInfo);
				logger.info("Successfully saved object: " + weatherInfo.toString());

			} else {
				logger.info("Unable to save object ");
			}

		};
	}



}
