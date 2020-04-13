package com.example.daggerapplication.dagger;

import com.example.daggerapplication.MainActivity;

import dagger.Component;

/**
 * Here we say where we can inject stuff from the Modules (Activities or Fragments)
 */
@Component(modules = {
        ViewModelModule.class,
        ServiceModule.class
}
)
public interface AppComponent {
    void inject(MainActivity activity);
}
