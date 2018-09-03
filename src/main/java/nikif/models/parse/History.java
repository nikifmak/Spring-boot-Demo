package nikif.models.parse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "utcdate",
    "observations",
    "dailysummary"
})
public class History {

    @JsonProperty("date")
    private Date date;
    @JsonProperty("utcdate")
    private UtcDate utcdate;
    @JsonProperty("observations")
    private List<Observation> observations = null;
    @JsonProperty("dailysummary")
    private List<DailySummary> dailysummary = null;

}
