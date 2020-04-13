package com.example.daggerapplication.services;

import android.util.Log;

import javax.inject.Inject;

public class CustomService {

    public AnotherService anotherService;

    @Inject
    public CustomService(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    public void doStuff() {
        Log.d("BRUTUS", "Doing Stuff");
    }
}
