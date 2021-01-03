package dk.weatherapp.weatherapi.services.clients;

import dk.weatherapp.weatherapi.model.WeatherReport;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class WeatherApiClient {

    private RestTemplate restTemplate;

    private String uri = "http://api.openweathermap.org/data/2.5/forecast?id={id}&appid={apikey}";
    private String apiKey = "32e0d09d0d007200079a8498496b6d43";

    public WeatherApiClient(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public Optional<WeatherReport> downloadReport(String locationId) {
        var data = restTemplate.getForEntity(uri, WeatherReport.class, locationId, apiKey);
        return Optional.ofNullable(data.getBody());
    }
}
