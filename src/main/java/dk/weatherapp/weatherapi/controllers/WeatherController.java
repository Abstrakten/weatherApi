package dk.weatherapp.weatherapi.controllers;

import dk.weatherapp.weatherapi.model.WeatherReport;
import dk.weatherapp.weatherapi.services.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(path = "/weather")
public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/locations/{locationId}")
    public ResponseEntity<WeatherReport> getLocation(@PathVariable String locationId) {
        var report = weatherService.getLocationReport(locationId);
        return ResponseEntity.of(report);
    }
}
