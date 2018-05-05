package com.example.administrator.mvp_basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.base.data.DataManager;
import com.example.home.HomeActivity;
import com.example.login.LoginActivity;

public class MainActivity extends AppCompatActivity implements SplashContract.SplashMvpView{

    private SplashPresenter mSplashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager= DataManager.getDataManager();

        mSplashPresenter=new SplashPresenter(dataManager);

        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {
        Intent intent= HomeActivity.getStartIntent(this);
        startActivity(intent);
        finish();

    }

    @Override
    public void openLoginActivity() {
        Intent intent= LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
