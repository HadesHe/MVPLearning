package com.example.administrator.mvp_basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.data.DataManager;
import com.example.home.HomeActivity;
import com.example.login.LoginActivity;
@Route(path = "/app/MainActivity")
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
        // TODO: 2018/5/14 startHomeActivity
//        Intent intent= HomeActivity.getStartIntent(this);
//        startActivity(intent);
//        finish();

        ARouter.getInstance().build("/home/HomeActivity").navigation();
        finish();

    }

    @Override
    public void openLoginActivity() {
        // TODO: 2018/5/14 startLoginActivity
//        Intent intent= LoginActivity.getStartIntent(this);
//        startActivity(intent);
//        finish();

        ARouter.getInstance().build("/login/LoginActivity").navigation();
        finish();
    }
}
