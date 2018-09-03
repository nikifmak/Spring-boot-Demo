package nikif.repositories;

import nikif.models.WeatherInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface that extends the CrudRepository interface used for saving and
 * reading the WeatherInfo pojo (in general can be used for all
 * create, read, update, delete actions).
 *
 * The database used is agnostic and can be defined in the application.yaml
 */
public interface WeatherInfoRepository extends CrudRepository<WeatherInfo, Long> {}
