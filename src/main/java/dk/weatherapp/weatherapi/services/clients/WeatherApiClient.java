package dk.weatherapp.weatherapi.services.clients;

import dk.weatherapp.weatherapi.model.WeatherReport;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeatherApiClient {

    public Optional<WeatherReport> downloadReport(String locationId) {
        return Optional.of(new WeatherReport());
    }
}
