package com.example.daggerapplication;

import android.app.Application;

import com.example.daggerapplication.dagger.AppComponent;
import com.example.daggerapplication.dagger.AppModule;
import com.example.daggerapplication.dagger.DaggerAppComponent;

public class CustomApplication extends Application {

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
