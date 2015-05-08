package com.example.valerie.stormy.weatherapi;

import android.content.Context;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Valerie on 5/8/2015.
 */
public class WeatherClient {

    private static final String API_URL = "https://api.forecast.io/forecast/";
    private static final String API_KEY = "336c145901f19fa02c0324ed0d179514";

    private static WeatherClient mWeatherClient;
    private static RestAdapter mAsyncRestAdapter;


    private WeatherClient() {
        mAsyncRestAdapter = new RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setClient(new OkClient(new OkHttpClient()))
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
    }

    public static WeatherClient getInstance() {
        if (mWeatherClient == null) {
            mWeatherClient = new WeatherClient();
        }
        return mWeatherClient;
    }




}
