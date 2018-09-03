package nikif.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import nikif.models.parse.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Implementation of the JsonDeserializerService
 * Jackson's ObjectMapper is used for deserialization of the json string.
 */
@Service
public class JsonDeserializerServiceImpl implements JsonDeserializerService {

    private static final Logger logger = LoggerFactory.getLogger(JsonDeserializerServiceImpl.class);

    @Override
    public ApiResponse deserializeApiResponse(String json) {

        logger.info("Start JsonDeserializerServiceImpl.deserializeApiResponse");

        ApiResponse apiResponse = null;

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            apiResponse = objectMapper.readValue(json, ApiResponse.class);
        } catch (IOException e) {
            logger.info("Error occurred while deserializing the json response ");
            logger.info(e.getMessage());
        }

        logger.info("End JsonDeserializerServiceImpl.deserializeApiResponse");

        return apiResponse;
    }
}
