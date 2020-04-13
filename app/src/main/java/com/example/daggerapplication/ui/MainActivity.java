package com.example.daggerapplication.ui;

import android.os.Bundle;

import com.example.daggerapplication.R;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Main Activity, we should extends from Dagger
 */
public class MainActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
