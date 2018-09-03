package nikif.models.parse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "termsofService",
    "features"
})
public class Response {

    @JsonProperty("version")
    private String version;
    @JsonProperty("termsofService")
    private String termsofService;
    @JsonProperty("features")
    private Features features;

}
