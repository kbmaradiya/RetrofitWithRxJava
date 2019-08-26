package com.example.mit.retrofitwithrxjava.network;


import com.example.mit.retrofitwithrxjava.models.Plans;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface NetworkInterface {

    @FormUrlEncoded
    @POST("ws_fetchBasicCanine")
    Observable<Plans> getMovies(@Field("user_id") String uId);
}
