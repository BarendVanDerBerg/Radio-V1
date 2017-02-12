package com.barend.radiov1.Model;

/**
 * Created by Barend on 2017/02/12.
 */

public class Station {

    final String DRAWABLE = "drawable/";

    private String stationTitle;

    private String imageUri;

    public Station(String stationTitle, String imageUri) {
        this.imageUri = imageUri;
        this.stationTitle = stationTitle;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImageUri() {
        return DRAWABLE + imageUri;
    }
}
