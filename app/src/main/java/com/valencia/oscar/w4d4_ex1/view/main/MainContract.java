package com.valencia.oscar.w4d4_ex1.view.main;

public interface MainContract {

    interface View{
        void showResult(String result);
        void showError(String error);
        void navigateToSecond();
    }

    interface Presenter{
        void calculateAddition(String argumentA, String argumentB);
        void onNavigateToSecondClicked();
    }
}
