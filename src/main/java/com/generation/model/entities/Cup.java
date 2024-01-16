package com.generation.model.entities;

public class Cup extends Glassware
{
    private boolean handle;
    private String img_url;

    public Cup(){}

    

    public Cup(int id, String material, double price, int volume, boolean handle, String img_url) {
        super(id, material, price, volume);
        this.handle = handle;
        this.img_url = img_url;
    }



    public boolean isHandle() {
        return handle;
    }
    public void setHandle(boolean handle) {
        this.handle = handle;
    }
    public String getImg_url() {
        return img_url;
    }
    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    
}
