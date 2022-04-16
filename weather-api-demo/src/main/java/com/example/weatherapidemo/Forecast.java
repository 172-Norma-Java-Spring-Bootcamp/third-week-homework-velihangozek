package com.example.weatherapidemo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonPropertyOrder({"forecastday"})
public class Forecast {
    public ArrayList<Forecastday> forecastday;
}
