package com.example.administrator.mvp_basic;

import com.example.base.data.DataManager;
import com.example.base.ui.base.BasePresenter;

class SplashPresenter<V extends SplashContract.SplashMvpView> extends BasePresenter<V> implements SplashContract.SplashMvpPresenter<V>{


    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if(getDataManager().getLoggedInMode()){
            getMVPView().openMainActivity();
        }else{
            getMVPView().openLoginActivity();
        }

    }
}
