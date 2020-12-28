package com.poplar.bean;

import org.springframework.stereotype.Component;

/**
 * Create BY poplar ON 2020/12/21
 */
@Component
public class Water {

    private String color;

    /*密度*/
    private Double density;

    private Apple apple;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
}
