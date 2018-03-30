package com.a99zan.daggertest;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by 99zan on 2018/3/30.
 */

public class Product {
    @Inject
    public Product(){

    }

    public void toast (Context context){
        Toast.makeText(context, "inject", Toast.LENGTH_SHORT).show();
    }

}
