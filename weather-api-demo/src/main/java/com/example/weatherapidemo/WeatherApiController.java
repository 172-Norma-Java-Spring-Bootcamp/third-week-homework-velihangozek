package com.example.weatherapidemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class WeatherApiController {

    //    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
    WeatherApiDemoApplication weatherApiDemoApplication = new WeatherApiDemoApplication();

    @Autowired
    public WeatherApiController() throws IOException {
    }

    public void getWeatherByCityName() throws IOException {
        weatherApiDemoApplication.setRestTemplate(new RestTemplate());
        weatherApiDemoApplication.getWeatherByCityName("");
    }

    @GetMapping("/weather/{cityName}/")
    public Root weatherPathVariable(@PathVariable("cityName") String cityName){
        return new Root(cityName);
    }

    @GetMapping("/weather")
    public Root getWeatherByCityName(@RequestParam(value = "cityName") String cityName) throws IOException {
        // logger.info("Requesting weatherapi.com weather for : " + cityName);
        // Location location = new Location();
        // location.name = cityName;
        // Root root = restTemplate.getForObject(WEATHER_URL, Root.class);
        return new Root(cityName);
    }
}
