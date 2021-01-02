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
    private String apiKey = "a7455f93986f4e5d2da1019649eb7188";

    public WeatherApiClient(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public Optional<WeatherReport> downloadReport(String locationId) {
        var data = restTemplate.getForObject(uri, String.class, locationId, apiKey);
        return Optional.of(new WeatherReport(data));
    }
}
