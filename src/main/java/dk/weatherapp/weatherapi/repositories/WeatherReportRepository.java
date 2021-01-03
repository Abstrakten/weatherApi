package dk.weatherapp.weatherapi.repositories;

import dk.weatherapp.weatherapi.model.WeatherReport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WeatherReportRepository extends CrudRepository<WeatherReport, String> {

    Optional<WeatherReport> findByCityId(String id);
}
