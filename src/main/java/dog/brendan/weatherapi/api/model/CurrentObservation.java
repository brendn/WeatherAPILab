package dog.brendan.weatherapi.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentObservation {

    @JsonProperty("Temp")
    public String temp;

    @JsonProperty("Weather")
    public String weather;

}
