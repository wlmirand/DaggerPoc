package com.example.daggerapplication.dagger.module;

import com.example.daggerapplication.services.AnotherService;
import com.example.daggerapplication.services.CustomService;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    @Provides
    public CustomService provideCustomService(AnotherService anotherService) {
        return new CustomService(anotherService);
    }

    @Provides
    public AnotherService provideAnotherService() {
        return new AnotherService();
    }
}
