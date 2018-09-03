package nikif.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Pojo that models the 4 requested specific details about the weather
 * It is used for saving and fetching the data from the in memory db.
 *
 * Also used by jpa when the application firstly runs so that the equivalent Table is
 * created in the used database.
 */
@Data
@Entity
public class WeatherInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String maxHumidity;
    private String maxtempm;
    private String mintempm;
    private String precipm;
}