package com.example.valerie.stormy.weatherapi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Valerie on 5/8/2015.
 */
public class Forecast {

    @SerializedName("latitude")
    private double mLatitude;
    public double getLatitude() {
        return mLatitude;
    }

    @SerializedName("longitude")
    private double mLongitude;
    public double getLongitude() {
        return mLongitude;
    }

    @SerializedName("timezone")
    private String mTimeZone;
    public String getTimeZone() {
        return mTimeZone;
    }

    @SerializedName("offset")
    private int mOffset;
    public int getOffset(){
        return mOffset;
    }

    @SerializedName("currently")
    private Currently mCurrently;
    public Currently getCurrently() {
        return mCurrently;
    }


}
