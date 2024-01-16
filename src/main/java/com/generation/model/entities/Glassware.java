package com.generation.model.entities;

/**
 * Contenitore generico, bicchiere o tazza
 */
public abstract class Glassware 
{
    protected int id;
    protected String material;
    protected double price;
    protected int volume;

    public Glassware(){}

    public Glassware(int id, String material, double price, int volume) {
        this.id = id;
        this.material = material;
        this.price = price;
        this.volume = volume;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    
}
