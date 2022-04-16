package com.example.weatherapidemo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.logging.Logger;

@Slf4j
@SpringBootApplication
@ControllerAdvice
public class WeatherApiDemoApplication implements java.io.Serializable {
    @Autowired
    public WeatherApiDemoApplication() throws IOException {
    }


    private static final URI WEATHER_URL = URI.create("http://api.weatherapi.com/v1/forecast.json?key=c645a2c602b94b79a54221044221504&q=Istanbul&days=1&aqi=no&alerts=no");
    // private final Logger logger = (Logger) LoggerFactory.getLogger(WeatherApiDemoApplication.class);
    private RestTemplate restTemplate;
    ObjectMapper om = new ObjectMapper();

    // Root root = om.readValue("myCity", Root.class);

//    public WeatherApiDemoApplication(RestTemplate restTemplate) throws JsonProcessingException {
//        this.restTemplate = restTemplate;
//    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(WeatherApiDemoApplication.class, args);


    }

    public void getWeatherByCityName(String s) {
    }

//    @GetMapping("/weather")
//    public String fetchWeatherData(@RequestParam(value = "myCity", defaultValue = "World") String city) {
//        return String.format("Weather in %s!", city);
//
//    }





}

