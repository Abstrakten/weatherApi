package dk.weatherapp.weatherapi.services;

import dk.weatherapp.weatherapi.model.WeatherReport;
import dk.weatherapp.weatherapi.repositories.WeatherReportRepository;
import dk.weatherapp.weatherapi.services.clients.WeatherApiClient;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeatherService {

    private WeatherReportRepository weatherReportRepository;
    private WeatherApiClient weatherApiClient;

    public WeatherService(WeatherReportRepository weatherReportRepository, WeatherApiClient weatherApiClient) {
        this.weatherReportRepository = weatherReportRepository;
        this.weatherApiClient = weatherApiClient;
    }

    public Optional<WeatherReport> getLocationReport(String locationId) {
        var report = weatherReportRepository.findById(locationId);
        if (report.isEmpty()) {
            report = downloadReport(locationId);
        }
        return report;
    }

    private Optional<WeatherReport> downloadReport(String locationId) {
        var freshReport = weatherApiClient.downloadReport(locationId);
        if (freshReport.isPresent()) {
            freshReport = Optional.of(weatherReportRepository.save(freshReport.get()));
        }
        return freshReport;
    }

}
