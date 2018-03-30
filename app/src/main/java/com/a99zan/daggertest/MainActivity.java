package com.a99zan.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Product product;
    @Inject
    Factory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerFactoryActivityComponent.create().inject(this);

//        product.toast(this);
//        factory.toast(this);

    }
}
