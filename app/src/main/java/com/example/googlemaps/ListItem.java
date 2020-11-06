package com.example.googlemaps;

public class ListItem {
    private String countryName;

    // Image name (Without extension)
    private String img;
    private String desc;

    public ListItem(String countryName, String desc) {
        this.countryName= countryName;
        this.img = "unknown_avatar";
        this.desc= desc;
    }

    public ListItem(String countryName, String desc, String img) {
        this.countryName= countryName;
        this.img = img;
        this.desc= desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString()  {
        return this.countryName+" (" + desc + ")";
    }
}
