package com.example.weatherapidemo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"text", "icon", "code"})
public class Condition {
    public String text;
    public String icon;
    public int code;
}
