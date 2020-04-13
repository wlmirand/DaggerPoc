package com.example.daggerapplication.dagger.module;

import com.example.daggerapplication.services.CustomService;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    @Provides
    public CustomService provideCustomService() {
        return new CustomService();
    }
}
