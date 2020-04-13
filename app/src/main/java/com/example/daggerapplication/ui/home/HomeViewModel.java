package com.example.daggerapplication.ui.home;

import androidx.lifecycle.ViewModel;

import com.example.daggerapplication.services.CustomService;

import javax.inject.Inject;

public class HomeViewModel extends ViewModel {

    private CustomService customService;

    @Inject
    public HomeViewModel(CustomService service) {
        customService = service;
    }

    public void consumeService() {
        customService.doStuff();
    }
}
