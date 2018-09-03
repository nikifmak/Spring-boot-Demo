package nikif.services;


import nikif.models.parse.ApiResponse;

/**
 * Interface that contains the methods used to do the http requests and fetch the data
 * needed from the wunderground's API.
 *
 * getWundergroundDataAsString returns the json as a string so further processing is required
 * with the JsonDeserializerService in order to get the json as pojo
 *
 * getWundergroundDataAsObject returns the ApiResponse as pojo but it was not used as
 * the use of multiple services was considered better choice for demonstration purposes
 */
public interface HttpRequestService {

    String getWundergroundDataAsString(String apiKey, String dateYYYYMMDD, String areaCode, String requestedJson);

    ApiResponse getWundergroundDataAsObject(String apiKey, String dateYYYYMMDD, String areaCode, String requestedJson);
}
