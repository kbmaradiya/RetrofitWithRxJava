package com.example.mit.retrofitwithrxjava.repository;


import android.util.Log;

import com.example.mit.retrofitwithrxjava.models.Plans;
import com.example.mit.retrofitwithrxjava.network.NetworkClient;
import com.example.mit.retrofitwithrxjava.network.NetworkInterface;


import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainActivityRepository {


    public static void getPlans(String uId) {

        Retrofit retrofit = NetworkClient.getRetrofit();

        NetworkInterface networkInterface = retrofit.create(NetworkInterface.class);

        Observable<Plans> plansObservable = networkInterface.getMovies(uId);

        plansObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Plans>() {
                    @Override
                    public void accept(Plans plans) throws Exception {
                        Log.e("MainActivityRepository",plans.getCode()+"");
                    }
                });

    }
}
