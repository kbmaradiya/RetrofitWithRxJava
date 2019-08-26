package com.example.mit.retrofitwithrxjava.viewmodel;

import android.app.Activity;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;

import com.example.mit.retrofitwithrxjava.MainActivity;
import com.example.mit.retrofitwithrxjava.models.Datum;
import com.example.mit.retrofitwithrxjava.repository.MainActivityRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel{


    private static MutableLiveData<List<Datum>> datumMutableLiveData;
    private static MainActivityViewModel mainActivityViewModel;

    public MutableLiveData<List<Datum>> getDatumMutableLiveData() {
        if (datumMutableLiveData==null){
            datumMutableLiveData=new MutableLiveData<>();
        }
        return datumMutableLiveData;
    }

    public static MainActivityViewModel getInstance(FragmentActivity activity){
        if (mainActivityViewModel==null) {
            mainActivityViewModel= ViewModelProviders.of(activity).get(MainActivityViewModel.class);
        }
        return mainActivityViewModel;
    }

    public void getPlans(String uId){
        MainActivityRepository.getPlans(uId);
    }
}
