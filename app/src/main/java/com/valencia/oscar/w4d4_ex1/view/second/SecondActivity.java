package com.valencia.oscar.w4d4_ex1.view.second;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.valencia.oscar.w4d4_ex1.R;
import com.valencia.oscar.w4d4_ex1.app.MyApp;
import com.valencia.oscar.w4d4_ex1.model.Calculator;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = SecondActivity.class.getSimpleName()+"_TAG";


    @Inject
    Calculator calculator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
