package com.example.googlemaps;

import com.google.android.gms.maps.model.LatLng;

public class ListItem {
    private String countryName;

    // Image name (Without extension)
    private String img;
    private String desc;
    private LatLng coords;

    public ListItem(String countryName, String desc, LatLng coords) {
        this.countryName= countryName;
        this.img = "unknown_avatar";
        this.desc= desc;
        this.coords = coords;
    }

    public ListItem(String countryName, String desc, LatLng coords, String img) {
        this.countryName= countryName;
        this.img = img;
        this.desc= desc;
        this.coords = coords;
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

    public LatLng getCoords() {
        return coords;
    }

    public void setCoords(LatLng coords) {
        this.coords = coords;
    }

    @Override
    public String toString()  {
        return this.countryName+" (" + desc + ")";
    }
}
