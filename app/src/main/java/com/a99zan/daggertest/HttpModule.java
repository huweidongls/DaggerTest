package com.a99zan.daggertest;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by 99zan on 2018/3/30.
 */

@Module
public class HttpModule {

    private int cacheSize;

    public HttpModule(int cacheSize){
        this.cacheSize = cacheSize;
    }

    @Provides
    OkHttpClient provideOkHttpClient(){
        Log.e("111", this.cacheSize+"");
        OkHttpClient okHttpClient = new OkHttpClient();
        return okHttpClient;
    }

}
