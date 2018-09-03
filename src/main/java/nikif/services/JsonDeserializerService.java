package nikif.services;

import nikif.models.parse.ApiResponse;

/**
 * Interface used to declare the method responsible for converting the json from string to
 * a pojo
 */
public interface JsonDeserializerService {

    ApiResponse deserializeApiResponse(String json);
}
