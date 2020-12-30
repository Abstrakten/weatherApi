package dk.weatherapp.weatherapi.repositories;

import dk.weatherapp.weatherapi.model.WeatherReport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherReportRepository extends CrudRepository<WeatherReport, String> {
}
