package com.example.daggerapplication.dagger;

import android.app.Application;

import com.example.daggerapplication.dagger.module.ActivityBindingModule;
import com.example.daggerapplication.dagger.module.ApiModule;
import com.example.daggerapplication.dagger.module.ContextModule;
import com.example.daggerapplication.dagger.module.ViewModelModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * App Component that wires up everything
 */
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ContextModule.class,
                ApiModule.class,
                ViewModelModule.class,
                ActivityBindingModule.class
        }
)
public interface ApplicationComponent extends AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {

        /**
         * Let Dagger "store" the Application Context
         */
        @BindsInstance
        Builder application(Application application);

        /**
         * Builder for Dagger Component
         */
        ApplicationComponent build();
    }
}