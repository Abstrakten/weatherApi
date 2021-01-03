package dk.weatherapp.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Forecast {

    @JsonProperty("dt")
    @Field(type = FieldType.Date, format = DateFormat.epoch_millis)
    private Instant timestamp;

    @JsonProperty("main")
    private Atmosphere atmosphere;

    @JsonProperty("weather")
    private List<Weather> weather = new ArrayList<>();

    @JsonProperty("clouds")
    private Clouds clouds;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("visibility")
    private Integer visibility;

    @JsonProperty("pop")
    private Integer ProbabilityOfPrecipitation;

    @JsonProperty("sys")
    private Sys sys;

}
