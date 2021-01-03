package dk.weatherapp.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Document(indexName = "weatherreport")
public class WeatherReport implements Persistable<String> {

    public WeatherReport() {
        this.createdAt = LocalDateTime.now();
    }

    @CreatedDate
    @Field(type = FieldType.Date, format = DateFormat.basic_date_time)
    private LocalDateTime createdAt;

    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("city")
    private City city;

    @JsonProperty("list")
    private List<Forecast> forecasts = new ArrayList<>();

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
