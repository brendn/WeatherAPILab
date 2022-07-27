package dog.brendan.weatherapi.api.service;

import dog.brendan.weatherapi.api.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    public static final String API_URL = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";

    private RestTemplate request = new RestTemplate();

    public WeatherResponse getWeather(double lat, double lon) {
        String out = String.format("https://forecast.weather.gov/MapClick.php?lat=%s&lon=%s&FcstType=json", lat, lon);
        return request.getForObject(out, WeatherResponse.class);
    }
}
