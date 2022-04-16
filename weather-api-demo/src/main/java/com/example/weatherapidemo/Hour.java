package com.example.weatherapidemo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"time_epoch", "time", "temp_c", "temp_f", "is_day", "condition", "wind_mph", "wind_kph",
        "wind_degree", "wind_dir", "pressure_mb", "pressure_in", "precip_mm", "precip_in", "humidity", "cloud",
        "feelslike_c", "feelslike_f", "windchill_c", "windchill_f", "heatindex_c", "heatindex_f", "dewpoint_c",
        "dewpoint_f", "will_it_rain","chance_of_rain","will_it_snow","chance_of_snow","vis_km","vis_miles","gust_mph",
        "gust_kph","uv",})
public class Hour {
    public int time_epoch;
    public String time;
    public double temp_c;
    public double temp_f;
    public int is_day;
    public Condition condition;
    public double wind_mph;
    public double wind_kph;
    public int wind_degree;
    public String wind_dir;
    public double pressure_mb;
    public double pressure_in;
    public double precip_mm;
    public double precip_in;
    public int humidity;
    public int cloud;
    public double feelslike_c;
    public double feelslike_f;
    public double windchill_c;
    public double windchill_f;
    public double heatindex_c;
    public double heatindex_f;
    public double dewpoint_c;
    public double dewpoint_f;
    public int will_it_rain;
    public int chance_of_rain;
    public int will_it_snow;
    public int chance_of_snow;
    public double vis_km;
    public double vis_miles;
    public double gust_mph;
    public double gust_kph;
    public double uv;
}
