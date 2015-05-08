package com.example.valerie.stormy.ottoevents;

import com.example.valerie.stormy.weatherapi.models.Forecast;

/**
 * Created by Valerie on 5/8/2015.
 */
public class ResponseWeatherEvent {
    private Forecast mForecast;

    public ResponseWeatherEvent(Forecast forecast) {
        this.mForecast = forecast;
    }

    public Forecast getForecast() {
        return mForecast;
    }
}
