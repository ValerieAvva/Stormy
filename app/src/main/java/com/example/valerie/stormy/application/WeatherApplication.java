package com.example.valerie.stormy.application;

import android.app.Application;

import com.example.valerie.stormy.Manager.WeatherManager;
import com.example.valerie.stormy.bus.BusProvider;
import com.squareup.otto.Bus;

/**
 * Created by Valerie on 5/8/2015.
 */
public class WeatherApplication extends Application {
    private WeatherManager mWeatherManager;
    private Bus mBus = BusProvider.getInstance();

    @Override
    public void onCreate() {
        mWeatherManager = new WeatherManager(this, mBus);
        mBus.register(mWeatherManager);
        mBus.register(this); //listen for "global" events
    }


}
