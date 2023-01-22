package com.rkbapps.customlistview;

public class ModelClass {

    private String name,phoneNumber;
    private int Image;


    public ModelClass() {
        //Empty Constructor
    }

    public ModelClass(String name, String phoneNumber, int image) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        Image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
