package nikif.services;

import nikif.models.parse.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * Implementation of the HttpRequestService
 * RestTemplate is used as the core for the execution of the http requests.
 */
@Service
public class HttpRequestServiceImpl implements HttpRequestService {

    @Value("${api.base.url}")
    private String baseUrl;

    private static final Logger logger = LoggerFactory.getLogger(HttpRequestServiceImpl.class);

    private final RestTemplate restTemplate;

    public HttpRequestServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public String getWundergroundDataAsString(String apiKey, String dateYYYYMMDD, String areaCode, String requestedJson) {
        logger.info("Start HttpRequestServiceImpl.getWundergroundDataAsString");
        String response = null;

        try {
            response = restTemplate.getForObject(
                    baseUrl + "/api/{apiKey}/history_{dateYYYYMMDD}/q/{areaCode}/{requestedJson}",
                    String.class,
                    apiKey,
                    dateYYYYMMDD,
                    areaCode,
                    requestedJson);
        } catch (Exception exception) {
            logger.info("An error occurred while executing the request");
        }

        logger.info("End HttpRequestServiceImpl.getWundergroundDataAsString");
        return response;
    }

    @Override
    public ApiResponse getWundergroundDataAsObject(String apiKey, String dateYYYYMMDD, String areaCode, String requestedJson) {
        logger.info("Start HttpRequestServiceImpl.getWundergroundDataAsObject");
        ApiResponse response = null;

        try {
            response = restTemplate.getForObject(
                    baseUrl + "/api/{apiKey}/history_{dateYYYYMMDD}/q/{areaCode}/{requestedJson}",
                    ApiResponse.class,
                    apiKey,
                    dateYYYYMMDD,
                    areaCode,
                    requestedJson);

        } catch (Exception exception) {
            logger.info("An error occurred while executing the request");
        }

        logger.info("End HttpRequestServiceImpl.getWundergroundDataAsObject");
        return response;
    }
}
