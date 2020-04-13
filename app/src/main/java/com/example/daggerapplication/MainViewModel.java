package com.example.daggerapplication;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class MainViewModel extends ViewModel {

    private CustomService customService;

    @Inject
    public MainViewModel(CustomService customService) {
        this.customService = customService;
    }

    public void useService() {
        customService.doStuff();
    }
}
