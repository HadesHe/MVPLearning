package com.example.administrator.mvp_basic;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.data.DataManager;
import com.example.base.data.SharedPrefsHelper;

public class MvpApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if(BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();
        }

        ARouter.init(this);

        SharedPrefsHelper sharedPrefsHelper=new SharedPrefsHelper(getApplicationContext());
        DataManager.init(sharedPrefsHelper);
    }

}
