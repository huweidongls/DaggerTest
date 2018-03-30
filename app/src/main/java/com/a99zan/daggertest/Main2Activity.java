package com.a99zan.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

public class Main2Activity extends AppCompatActivity {

    @Inject
    Factory factory;
    @Inject
    OkHttpClient okHttpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        DaggerFactoryActivityComponent.builder().httpModule(new HttpModule(1010101))
                .build().inject(this);

        factory.toast(this);

    }
}
