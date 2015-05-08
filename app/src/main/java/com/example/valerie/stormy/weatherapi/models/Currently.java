package com.example.valerie.stormy.weatherapi.models;

import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Valerie on 5/8/2015.
 */
public class Currently {

    @SerializedName("time")
    private long mTime;
    public String getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(TimeZone.getDefault().getDisplayName()));
        Date dateTime = new Date(mTime * 1000);
        String timeString = formatter.format(dateTime);
        return timeString;
    }

    @SerializedName("summary")
    private String mSummary;
    public String getSummary() {
        return mSummary;
    }

    @SerializedName("icon")
    private String mIcon;
    public String getIcon() {
        return mIcon;
    }

    @SerializedName("precipProbability")
    private double mPrecipProbablilty;
    public double getPrecipProbablilty() {
        return mPrecipProbablilty;
    }

    @SerializedName("temperature")
    private double mTemperature;
    public double getTemperature() {
        return mTemperature;
    }

    @SerializedName("humidity")
    private double mHumidity;
    public double getHumidity() {
        return mHumidity;
    }


}
