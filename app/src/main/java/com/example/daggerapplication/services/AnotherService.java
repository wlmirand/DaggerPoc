package com.example.daggerapplication.services;

import android.util.Log;

import javax.inject.Inject;

public class AnotherService {

    @Inject
    public AnotherService(ApiService apiService) {

    }

    public void doAnotherStuff() {
        Log.d("BRUTUS", "Doing Another Stuff");
    }
}
