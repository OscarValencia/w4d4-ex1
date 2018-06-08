package com.valencia.oscar.w4d4_ex1.view.main;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    private final MainContract.View mainView;

    public MainModule(MainContract.View mainView){
        this.mainView = mainView;
    }

    @MainScope
    @Provides
    MainContract.View prividesVide(){
        return mainView;
    }
}
