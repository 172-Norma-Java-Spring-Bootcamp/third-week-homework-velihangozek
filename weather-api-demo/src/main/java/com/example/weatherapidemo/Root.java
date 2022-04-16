package com.example.weatherapidemo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

@JsonPropertyOrder({"location", "current", "forecast"})
public class Root extends OutputStream implements Serializable {
    public Location location;
    public Current current;
    public Forecast forecast;


    public Root(String cityName) {
        location = new Location();
        this.location.name = cityName;
    }

    @Override
    public void write(int b) throws IOException {

    }
}
