package com.a99zan.daggertest;

import dagger.Component;

/**
 * Created by 99zan on 2018/3/30.
 */

@Component
public interface FactoryActivityComponent {
    void inject(MainActivity activity);
}
