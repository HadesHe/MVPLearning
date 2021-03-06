package com.example.administrator.mvp_basic;

import com.example.base.ui.base.MVPPresenter;
import com.example.base.ui.base.MVPView;

public interface SplashContract {

    interface SplashMvpView extends MVPView{

        void openMainActivity();

        void openLoginActivity();
    }

    interface SplashMvpPresenter<V extends SplashMvpView> extends MVPPresenter<V>{

        void decideNextActivity();
    }
}
