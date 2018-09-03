package nikif.models.parse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "response",
    "history"
})
public class ApiResponse {

    @JsonProperty("response")
    private Response response;
    @JsonProperty("history")
    private History history;

}
