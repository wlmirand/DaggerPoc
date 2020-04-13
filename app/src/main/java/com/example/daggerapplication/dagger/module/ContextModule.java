package com.example.daggerapplication.dagger.module;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Module to return the Application Context when needed
 */
@Module
public abstract class ContextModule {

    @Binds
    abstract Context provideContext(Application application);
}
