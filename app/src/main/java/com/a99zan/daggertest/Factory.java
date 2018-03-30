package com.a99zan.daggertest;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by 99zan on 2018/3/30.
 */

public class Factory {
    Product product;

    @Inject
    public Factory(Product product){
        this.product = product;
    }

    public void toast(Context context){
        product.toast(context);
    }

}
