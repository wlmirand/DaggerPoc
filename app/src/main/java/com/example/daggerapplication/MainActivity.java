package com.example.daggerapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.daggerapplication.dagger.AppComponent;
import com.example.daggerapplication.dagger.AppModule;
import com.example.daggerapplication.dagger.DaggerAppComponent;
import com.example.daggerapplication.vm.ViewModelFactory;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /**
     * ViewModel Factory, because we dont want to pass lots of parameters
     */
    @Inject
    ViewModelFactory viewModelFactory;

    /**
     * ViewModel for this Activity
     */
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((CustomApplication) getApplication()).appComponent.inject(this);

        viewModel = new ViewModelProvider(this, viewModelFactory).get(MainViewModel.class);
    }

    @Override
    protected void onResume() {
        super.onResume();

        viewModel.useService();
    }
}
