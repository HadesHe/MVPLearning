package com.example.administrator.mvp_basic;

import android.app.Application;

import com.example.base.data.DataManager;
import com.example.base.data.SharedPrefsHelper;

public class MvpApp extends Application {
    private DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper=new SharedPrefsHelper(getApplicationContext());
        dataManager=new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager(){
        return dataManager;
    }
}
