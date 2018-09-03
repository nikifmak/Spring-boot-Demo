package nikif.models.parse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pretty",
    "year",
    "mon",
    "mday",
    "hour",
    "min",
    "tzname"
})
public class UtcDate {

    @JsonProperty("pretty")
    private String pretty;
    @JsonProperty("year")
    private String year;
    @JsonProperty("mon")
    private String mon;
    @JsonProperty("mday")
    private String mday;
    @JsonProperty("hour")
    private String hour;
    @JsonProperty("min")
    private String min;
    @JsonProperty("tzname")
    private String tzname;

}
