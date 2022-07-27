package dog.brendan.weatherapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import dog.brendan.weatherapi.api.model.CurrentObservation;
import dog.brendan.weatherapi.api.model.Data;
import dog.brendan.weatherapi.api.model.Location;
import dog.brendan.weatherapi.api.model.Time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WeatherResponse {

    public Time time;

    public Location location;

    public Data data;

    @JsonProperty("currentobservation")
    public CurrentObservation observation;

    public String getTemperature() {
        return observation.temp;
    }

    public String getCurrentWeather() {
        return observation.weather;
    }

    public String getLocation() {
        return location.areaDescription;
    }

    public String[] getForecastWeather() {
        return data.weather;
    }

    public String[] getForecastTemps() {
        return data.temperature;
    }

    public String[] getForecastTimes() {
        return time.startPeriodName;
    }

    public String[] getIcons() {
        return data.iconLink;
    }

    public String[] getTempLabels() {
        return time.tempLabel;
    }

    public List<String> getFormattedForecast() {
        List<String> out = new ArrayList<>();
        for (int i = 0; i < getForecastTemps().length; i++) {
            out.add(getTempLabels()[i] + ": " + getForecastTemps()[i]);
        }
        return out;
    }

    public Map<String, String> getForecastMap() {
        List<String> temps = getFormattedForecast();
        List<String> times = Arrays.asList(getForecastTimes());
        return IntStream.range(0, temps.size())
                .boxed()
                .collect(Collectors.toMap(temps::get, times::get));
    }
}
