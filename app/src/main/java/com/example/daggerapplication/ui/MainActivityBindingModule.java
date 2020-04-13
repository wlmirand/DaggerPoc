package com.example.daggerapplication.ui;

import com.example.daggerapplication.ui.home.HomeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Here we declare all Fragments we will use
 * Might not be needed once we use Navigation Arch component
 */
@Module
public abstract class MainActivityBindingModule {

    @ContributesAndroidInjector
    abstract HomeFragment provideHomeFragment();
}
