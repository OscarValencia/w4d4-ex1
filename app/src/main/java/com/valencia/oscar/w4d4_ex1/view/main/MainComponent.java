package com.valencia.oscar.w4d4_ex1.view.main;

import com.valencia.oscar.w4d4_ex1.app.AppComponent;

import dagger.Component;

@MainScope
@Component(
        dependencies = {AppComponent.class},
        modules={MainModule.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
