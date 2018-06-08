package com.valencia.oscar.w4d4_ex1.app;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public Context prividesCalculator(){
        return context;
    }
}
