package dk.weatherapp.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
class City {

    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("coord")
    private Coord coord;

    @JsonProperty("country")
    private String country;

    @JsonProperty("name")
    private String name;

    @JsonProperty("population")
    private Integer population;

    @JsonProperty("sunrise")
    private Integer sunrise;

    @JsonProperty("sunset")
    private Integer sunset;

    @JsonProperty("timezone")
    private Integer timezone;

}
