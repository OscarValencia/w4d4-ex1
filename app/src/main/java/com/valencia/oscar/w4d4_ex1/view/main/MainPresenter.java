package com.valencia.oscar.w4d4_ex1.view.main;

import com.valencia.oscar.w4d4_ex1.model.Calculator;

import javax.inject.Inject;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View mainView;

    @Inject
    Calculator calculator;

    @Inject
    public MainPresenter(MainContract.View mainView) {
        this.mainView = mainView;
    }

    @Override
    public void calculateAddition(String argumentA, String argumentB) {
        try{
            int a = Integer.parseInt(argumentA);
            int b = Integer.parseInt(argumentB);
            int result = calculator.add(a,b);
            mainView.showResult(String.valueOf(result));

        }catch(NumberFormatException e){
            e.printStackTrace();
            mainView.showError("Invalid input");
        }
    }

    @Override
    public void onNavigateToSecondClicked() {
        mainView.navigateToSecond();
    }
}
