package com.a99zan.daggertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Inject
    Product product;
    @Inject
    Factory factory;
    @Inject
    OkHttpClient okHttpClient;
//    @Inject
//    MoreParame moreParame;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        DaggerFactoryActivityComponent.builder()
                .httpModule(new HttpModule(10000))
                .build().inject(this);

//        product.toast(this);
        factory.toast(this);

//        moreParame.log();

    }
}
