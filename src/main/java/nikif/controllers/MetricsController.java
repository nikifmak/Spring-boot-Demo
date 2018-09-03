package nikif.controllers;

import nikif.models.WeatherInfo;
import nikif.repositories.WeatherInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * The Rest controller used in order the expose the metrics
 * It can be accessed through localhost:8080/api/metrics
 * Returns no object if the requested data is not available in the db.
 */
@RestController
@RequestMapping("/api")
public class MetricsController {

    @Autowired
    private WeatherInfoRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(MetricsController.class);

    @RequestMapping(value = "/metrics", method = RequestMethod.GET)
    public ResponseEntity<WeatherInfo>  getMetricsResponse() {

        logger.info("Start MetricsController.getMetricsResponse");
        ResponseEntity<WeatherInfo> responseEntity;

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");

        Optional<WeatherInfo> optional = repository.findById(new Long("1"));

        responseEntity = optional
                .map(weatherInfo -> new ResponseEntity<>(weatherInfo, headers, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(headers, HttpStatus.OK));
        logger.info("End MetricsController.getMetricsResponse response entity Status : " + responseEntity.getStatusCode());

        return responseEntity;

    }
}
