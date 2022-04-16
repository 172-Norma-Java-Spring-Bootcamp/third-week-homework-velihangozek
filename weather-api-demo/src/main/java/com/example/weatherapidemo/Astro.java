package com.example.weatherapidemo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"sunrise", "sunset", "moonrise", "moonset", "moon_phase", "moon_illumination"})
public class Astro {
    public String sunrise;
    public String sunset;
    public String moonrise;
    public String moonset;
    public String moon_phase;
    public String moon_illumination;
}
