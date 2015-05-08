package com.example.valerie.stormy.Manager;

import android.content.Context;

import com.example.valerie.stormy.ottoevents.RequestWeatherEvent;
import com.example.valerie.stormy.ottoevents.ResponseWeatherEvent;
import com.example.valerie.stormy.weatherapi.WeatherClient;
import com.example.valerie.stormy.weatherapi.models.Forecast;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Valerie on 5/8/2015.
 */
public class WeatherManager {

    private static final String API_KEY = "336c145901f19fa02c0324ed0d179514";
    private WeatherClient mWeatherClient;
    private Bus mBus;
    private Context mContext;

    public WeatherManager(Context context, Bus bus) {
        mContext = context;
        mBus = bus;
        mWeatherClient = WeatherClient.getInstance();
    }

    @Subscribe
    public void requestWeatherEvent(RequestWeatherEvent requestWeatherEvent) {
        double latitude = requestWeatherEvent.getLatitude();
        double longitude = requestWeatherEvent.getLongitude();

        Callback<Forecast> callback = new Callback<Forecast>() {
            @Override
            public void success(Forecast forecast, Response response) {
                mBus.post(new ResponseWeatherEvent(forecast));
            }

            @Override
            public void failure(RetrofitError error) {

            }
        };
        mWeatherClient.getForecast(API_KEY, latitude, longitude, callback);
    }

}
