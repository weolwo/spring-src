package com.poplar.factoryBean;

/**
 * Create BY poplar ON 2020/12/29
 */
public class Orange {

    private String color;

    private Double weight;

    public Orange(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
