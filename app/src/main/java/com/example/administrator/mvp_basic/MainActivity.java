package com.example.administrator.mvp_basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.mock.MockApplication;

import com.example.base.data.DataManager;

public class MainActivity extends AppCompatActivity implements SplashContract.SplashMvpView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager= ((MvpApp) getApplication()).getDataManager();

        mSplashPresenter=new SplashPresenter(dataManager);
    }
}
