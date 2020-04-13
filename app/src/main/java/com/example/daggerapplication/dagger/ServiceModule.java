package com.example.daggerapplication.dagger;

import com.example.daggerapplication.CustomService;

import dagger.Module;
import dagger.Provides;

/**
 * Module where we tell how to create the Services
 */
@Module
public class ServiceModule {

    @Provides
    CustomService customService() {
        return new CustomService();
    }

}
