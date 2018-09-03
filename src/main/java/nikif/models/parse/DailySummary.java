package nikif.models.parse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "fog",
    "rain",
    "snow",
    "snowfallm",
    "snowfalli",
    "monthtodatesnowfallm",
    "monthtodatesnowfalli",
    "since1julsnowfallm",
    "since1julsnowfalli",
    "snowdepthm",
    "snowdepthi",
    "hail",
    "thunder",
    "tornado",
    "meantempm",
    "meantempi",
    "meandewptm",
    "meandewpti",
    "meanpressurem",
    "meanpressurei",
    "meanwindspdm",
    "meanwindspdi",
    "meanwdire",
    "meanwdird",
    "meanvism",
    "meanvisi",
    "humidity",
    "maxtempm",
    "maxtempi",
    "mintempm",
    "mintempi",
    "maxhumidity",
    "minhumidity",
    "maxdewptm",
    "maxdewpti",
    "mindewptm",
    "mindewpti",
    "maxpressurem",
    "maxpressurei",
    "minpressurem",
    "minpressurei",
    "maxwspdm",
    "maxwspdi",
    "minwspdm",
    "minwspdi",
    "maxvism",
    "maxvisi",
    "minvism",
    "minvisi",
    "gdegreedays",
    "heatingdegreedays",
    "coolingdegreedays",
    "precipm",
    "precipi",
    "precipsource",
    "heatingdegreedaysnormal",
    "monthtodateheatingdegreedays",
    "monthtodateheatingdegreedaysnormal",
    "since1sepheatingdegreedays",
    "since1sepheatingdegreedaysnormal",
    "since1julheatingdegreedays",
    "since1julheatingdegreedaysnormal",
    "coolingdegreedaysnormal",
    "monthtodatecoolingdegreedays",
    "monthtodatecoolingdegreedaysnormal",
    "since1sepcoolingdegreedays",
    "since1sepcoolingdegreedaysnormal",
    "since1jancoolingdegreedays",
    "since1jancoolingdegreedaysnormal"
})
public class DailySummary {

    @JsonProperty("date")
    private Date date;
    @JsonProperty("fog")
    private String fog;
    @JsonProperty("rain")
    private String rain;
    @JsonProperty("snow")
    private String snow;
    @JsonProperty("snowfallm")
    private String snowfallm;
    @JsonProperty("snowfalli")
    private String snowfalli;
    @JsonProperty("monthtodatesnowfallm")
    private String monthtodatesnowfallm;
    @JsonProperty("monthtodatesnowfalli")
    private String monthtodatesnowfalli;
    @JsonProperty("since1julsnowfallm")
    private String since1julsnowfallm;
    @JsonProperty("since1julsnowfalli")
    private String since1julsnowfalli;
    @JsonProperty("snowdepthm")
    private String snowdepthm;
    @JsonProperty("snowdepthi")
    private String snowdepthi;
    @JsonProperty("hail")
    private String hail;
    @JsonProperty("thunder")
    private String thunder;
    @JsonProperty("tornado")
    private String tornado;
    @JsonProperty("meantempm")
    private String meantempm;
    @JsonProperty("meantempi")
    private String meantempi;
    @JsonProperty("meandewptm")
    private String meandewptm;
    @JsonProperty("meandewpti")
    private String meandewpti;
    @JsonProperty("meanpressurem")
    private String meanpressurem;
    @JsonProperty("meanpressurei")
    private String meanpressurei;
    @JsonProperty("meanwindspdm")
    private String meanwindspdm;
    @JsonProperty("meanwindspdi")
    private String meanwindspdi;
    @JsonProperty("meanwdire")
    private String meanwdire;
    @JsonProperty("meanwdird")
    private String meanwdird;
    @JsonProperty("meanvism")
    private String meanvism;
    @JsonProperty("meanvisi")
    private String meanvisi;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("maxtempm")
    private String maxtempm;
    @JsonProperty("maxtempi")
    private String maxtempi;
    @JsonProperty("mintempm")
    private String mintempm;
    @JsonProperty("mintempi")
    private String mintempi;
    @JsonProperty("maxhumidity")
    private String maxhumidity;
    @JsonProperty("minhumidity")
    private String minhumidity;
    @JsonProperty("maxdewptm")
    private String maxdewptm;
    @JsonProperty("maxdewpti")
    private String maxdewpti;
    @JsonProperty("mindewptm")
    private String mindewptm;
    @JsonProperty("mindewpti")
    private String mindewpti;
    @JsonProperty("maxpressurem")
    private String maxpressurem;
    @JsonProperty("maxpressurei")
    private String maxpressurei;
    @JsonProperty("minpressurem")
    private String minpressurem;
    @JsonProperty("minpressurei")
    private String minpressurei;
    @JsonProperty("maxwspdm")
    private String maxwspdm;
    @JsonProperty("maxwspdi")
    private String maxwspdi;
    @JsonProperty("minwspdm")
    private String minwspdm;
    @JsonProperty("minwspdi")
    private String minwspdi;
    @JsonProperty("maxvism")
    private String maxvism;
    @JsonProperty("maxvisi")
    private String maxvisi;
    @JsonProperty("minvism")
    private String minvism;
    @JsonProperty("minvisi")
    private String minvisi;
    @JsonProperty("gdegreedays")
    private String gdegreedays;
    @JsonProperty("heatingdegreedays")
    private String heatingdegreedays;
    @JsonProperty("coolingdegreedays")
    private String coolingdegreedays;
    @JsonProperty("precipm")
    private String precipm;
    @JsonProperty("precipi")
    private String precipi;
    @JsonProperty("precipsource")
    private String precipsource;
    @JsonProperty("heatingdegreedaysnormal")
    private String heatingdegreedaysnormal;
    @JsonProperty("monthtodateheatingdegreedays")
    private String monthtodateheatingdegreedays;
    @JsonProperty("monthtodateheatingdegreedaysnormal")
    private String monthtodateheatingdegreedaysnormal;
    @JsonProperty("since1sepheatingdegreedays")
    private String since1sepheatingdegreedays;
    @JsonProperty("since1sepheatingdegreedaysnormal")
    private String since1sepheatingdegreedaysnormal;
    @JsonProperty("since1julheatingdegreedays")
    private String since1julheatingdegreedays;
    @JsonProperty("since1julheatingdegreedaysnormal")
    private String since1julheatingdegreedaysnormal;
    @JsonProperty("coolingdegreedaysnormal")
    private String coolingdegreedaysnormal;
    @JsonProperty("monthtodatecoolingdegreedays")
    private String monthtodatecoolingdegreedays;
    @JsonProperty("monthtodatecoolingdegreedaysnormal")
    private String monthtodatecoolingdegreedaysnormal;
    @JsonProperty("since1sepcoolingdegreedays")
    private String since1sepcoolingdegreedays;
    @JsonProperty("since1sepcoolingdegreedaysnormal")
    private String since1sepcoolingdegreedaysnormal;
    @JsonProperty("since1jancoolingdegreedays")
    private String since1jancoolingdegreedays;
    @JsonProperty("since1jancoolingdegreedaysnormal")
    private String since1jancoolingdegreedaysnormal;

}
