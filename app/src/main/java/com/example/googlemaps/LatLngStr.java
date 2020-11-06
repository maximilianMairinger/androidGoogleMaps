package com.example.googlemaps;

import com.google.android.gms.maps.model.LatLng;

public class LatLngStr {
    public static LatLng parse(String coords) {
        String[] q = coords.split(",");
        return new LatLng(Double.parseDouble(q[0]), Double.parseDouble(q[1]));
    }
    public static String stringify(LatLng coords) {
        return "" + coords.latitude + "," + coords.longitude;
    }
}
