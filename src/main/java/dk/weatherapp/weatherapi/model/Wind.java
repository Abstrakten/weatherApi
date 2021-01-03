package dk.weatherapp.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Wind {

    @JsonProperty("speed")
    private Double speed;

    @JsonProperty("deg")
    private Integer degrees;

}
