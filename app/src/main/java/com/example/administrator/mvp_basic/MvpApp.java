package com.example.administrator.mvp_basic;

import android.app.Application;

import com.example.base.data.DataManager;
import com.example.base.data.SharedPrefsHelper;

public class MvpApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper=new SharedPrefsHelper(getApplicationContext());
        DataManager.init(sharedPrefsHelper);
    }

}
