package com.example.weatherapidemo;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"date", "date_epoch", "day", "astro", "hour"})
public class Forecastday {
    public String date;
    public int date_epoch;
    public Day day;
    public Astro astro;
    public ArrayList<Hour> hour;
}
