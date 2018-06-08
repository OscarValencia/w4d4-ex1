package com.valencia.oscar.w4d4_ex1.app;

import android.app.Application;

public class MyApp extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initDaggerAppComponent();
    }

    private void initDaggerAppComponent() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }
}
