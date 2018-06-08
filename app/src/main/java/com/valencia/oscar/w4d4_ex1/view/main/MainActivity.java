package com.valencia.oscar.w4d4_ex1.view.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.valencia.oscar.w4d4_ex1.app.MyApp;
import com.valencia.oscar.w4d4_ex1.R;
import com.valencia.oscar.w4d4_ex1.model.Calculator;
import com.valencia.oscar.w4d4_ex1.view.second.SecondActivity;
import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    @BindView(R.id.tvHello)TextView helloTV;
    @BindView(R.id.argBET)EditText argumentBET;
    @BindView(R.id.argAET)EditText argumentAET;

    @Inject Calculator calculator;
    @Inject MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DaggerMainComponent
                .builder()
                .appComponent(MyApp.getAppComponent())
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @OnClick(R.id.btAddition)
    public void addArguments(){
        mainPresenter.calculateAddition(argumentAET.getText().toString(),argumentBET.getText().toString());
    }

    @OnClick(R.id.btSecond)
    public void onNavigateToSecond(){
        mainPresenter.onNavigateToSecondClicked();
    }


    @Override
    public void navigateToSecond() {
        Intent second = new Intent(this, SecondActivity.class);
        startActivity(second);
    }

    @Override
    public void showResult(String result) {
        helloTV.setText(result);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }


}
