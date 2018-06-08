package com.valencia.oscar.w4d4_ex1.app;

import com.valencia.oscar.w4d4_ex1.model.Calculator;
import com.valencia.oscar.w4d4_ex1.model.UtilModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class,
        UtilModule.class
})
public interface AppComponent {
    Calculator calculator();

}
