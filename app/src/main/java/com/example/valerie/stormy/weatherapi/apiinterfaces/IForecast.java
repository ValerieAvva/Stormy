package com.example.valerie.stormy.weatherapi.apiinterfaces;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Valerie on 5/8/2015.
 */
public interface IForecast {

    @GET("/{api_key}/{latitude},{longitude}")
    void getForecast(@Path("api_key") String apiKey,
                     @Path("latitude") String latitude,
                     @Path("longitude") String longitude);

}
