package com.example.daggerapplication.dagger.module;

import com.example.daggerapplication.services.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit related objects
 */
@Module
public class ApiModule {

    /**
     * API Base URL
     */
    private static final String BASE_URL = "https://api.github.com/";

    /**
     * Retrofit object
     */
    @Singleton
    @Provides
    static Retrofit provideRetrofit() {
        return new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * Instance of the Retrofit Api Interface
     */
    @Singleton
    @Provides
    static ApiService provideRetrofitService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }
}
