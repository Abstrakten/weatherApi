package dk.weatherapp.weatherapi.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "reports")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class WeatherReport {

    @Id
    String id;

    @Field
    private final String data;

    public WeatherReport(String data) {
        this.data = data;
    }
}
