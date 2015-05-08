package com.example.valerie.stormy.weatherapi;

import android.content.Context;

import com.example.valerie.stormy.weatherapi.apiinterfaces.IForecast;
import com.example.valerie.stormy.weatherapi.models.Forecast;
import com.squareup.okhttp.OkHttpClient;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Valerie on 5/8/2015.
 */
public class WeatherClient {

    private static final String API_URL = "https://api.forecast.io/forecast/";

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

    public void getForecast(String apiKey, double latitude, double longitude, Callback<Forecast> callback) {
        IForecast forecast = mAsyncRestAdapter.create(IForecast.class);
        forecast.getForecast(apiKey, longitude, latitude, callback);
    }
}
