package com.example.daggerapplication.dagger;

import android.app.Application;

import com.example.daggerapplication.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Here we say where we can inject stuff from the Modules (Activities or Fragments)
 */
@Singleton
@Component(modules = {
        AppModule.class,
        ViewModelModule.class,
        ServiceModule.class
}
)
public interface AppComponent {
    Application application();
    
    void inject(MainActivity activity);
}
