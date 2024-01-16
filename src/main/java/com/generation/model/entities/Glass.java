package com.generation.model.entities;

public class Glass extends Glassware
{
    private String color;
    private String type;

    public Glass(){}

    public Glass(int id, String material, double price, int volume, String color, String type) {
        super(id, material, price, volume);
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
}
