package nikif.models.parse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "utcdate",
    "tempm",
    "tempi",
    "dewptm",
    "dewpti",
    "hum",
    "wspdm",
    "wspdi",
    "wgustm",
    "wgusti",
    "wdird",
    "wdire",
    "vism",
    "visi",
    "pressurem",
    "pressurei",
    "windchillm",
    "windchilli",
    "heatindexm",
    "heatindexi",
    "precipm",
    "precipi",
    "conds",
    "icon",
    "fog",
    "rain",
    "snow",
    "hail",
    "thunder",
    "tornado",
    "metar"
})
public class Observation {

    @JsonProperty("date")
    private Date date;
    @JsonProperty("utcdate")
    private UtcDate utcdate;
    @JsonProperty("tempm")
    private String tempm;
    @JsonProperty("tempi")
    private String tempi;
    @JsonProperty("dewptm")
    private String dewptm;
    @JsonProperty("dewpti")
    private String dewpti;
    @JsonProperty("hum")
    private String hum;
    @JsonProperty("wspdm")
    private String wspdm;
    @JsonProperty("wspdi")
    private String wspdi;
    @JsonProperty("wgustm")
    private String wgustm;
    @JsonProperty("wgusti")
    private String wgusti;
    @JsonProperty("wdird")
    private String wdird;
    @JsonProperty("wdire")
    private String wdire;
    @JsonProperty("vism")
    private String vism;
    @JsonProperty("visi")
    private String visi;
    @JsonProperty("pressurem")
    private String pressurem;
    @JsonProperty("pressurei")
    private String pressurei;
    @JsonProperty("windchillm")
    private String windchillm;
    @JsonProperty("windchilli")
    private String windchilli;
    @JsonProperty("heatindexm")
    private String heatindexm;
    @JsonProperty("heatindexi")
    private String heatindexi;
    @JsonProperty("precipm")
    private String precipm;
    @JsonProperty("precipi")
    private String precipi;
    @JsonProperty("conds")
    private String conds;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("fog")
    private String fog;
    @JsonProperty("rain")
    private String rain;
    @JsonProperty("snow")
    private String snow;
    @JsonProperty("hail")
    private String hail;
    @JsonProperty("thunder")
    private String thunder;
    @JsonProperty("tornado")
    private String tornado;
    @JsonProperty("metar")
    private String metar;
}
