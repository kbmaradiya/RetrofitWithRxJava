package com.example.mit.retrofitwithrxjava;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mit.retrofitwithrxjava.models.Datum;
import com.example.mit.retrofitwithrxjava.viewmodel.MainActivityViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityViewModel.getInstance(this).getDatumMutableLiveData().observe(this, new Observer<List<Datum>>() {
            @Override
            public void onChanged(@Nullable List<Datum> data) {

            }
        });

        MainActivityViewModel.getInstance(this).getPlans("870");
    }
}
