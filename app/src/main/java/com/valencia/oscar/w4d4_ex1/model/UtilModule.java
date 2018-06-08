package com.valencia.oscar.w4d4_ex1.model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UtilModule {

    @Singleton
    @Provides
    Calculator providesCalculator(){
        return new Calculator();
    }
}
