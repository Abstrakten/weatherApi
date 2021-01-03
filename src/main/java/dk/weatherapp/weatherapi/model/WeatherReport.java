package dk.weatherapp.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "weatherreport")
public class WeatherReport {

    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("city")
    private City city;

    @JsonProperty("list")
    private List<Forecast> forecasts = new ArrayList<>();

}
