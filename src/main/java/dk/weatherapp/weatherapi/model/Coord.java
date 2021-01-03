package dk.weatherapp.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Coord {

    @JsonProperty("lat")
    private Double lat;

    @JsonProperty("lon")
    private Double lon;

}
