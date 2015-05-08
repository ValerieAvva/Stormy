package com.example.valerie.stormy.ottoevents;

/**
 * Created by Valerie on 5/8/2015.
 */
public class RequestWeatherEvent {
    private double mLongitude;
    private double mLatitude;

    public RequestWeatherEvent(double latitude, double longitude){
        this.mLatitude = latitude;
        this.mLongitude = longitude;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public double getLongitude() {
        return mLongitude;
    }
}
