package com.example.daggerapplication.dagger;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.daggerapplication.CustomService;
import com.example.daggerapplication.MainViewModel;
import com.example.daggerapplication.vm.ViewModelFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

import javax.inject.Provider;

import dagger.MapKey;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

/**
 * Module where we tell how to create the ViewModels and the Factories
 */
@Module
public class ViewModelModule {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @MapKey
    @interface ViewModelKey {
        Class<? extends ViewModel> value();
    }

    @Provides
    ViewModelFactory viewModelFactory(Map<Class<? extends ViewModel>, Provider<ViewModel>> providerMap) {
        return new ViewModelFactory(providerMap);
    }

    @Provides
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    ViewModel mainViewModel(CustomService customService) {
        return new MainViewModel(customService);
    }
}