package dog.brendan.weatherapi;

import dog.brendan.weatherapi.api.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/weather")
    public String show(@RequestParam double latitude, @RequestParam double longitude, Model model) {
        model.addAttribute("weather", weatherService.getWeather(latitude, longitude));
        return "weather";
    }
}
