package com.example.home;

import com.example.base.ui.base.BasePresenter;
import com.example.base.ui.base.MVPPresenter;
import com.example.base.ui.base.MVPView;

public interface HomeContract {

    interface HomeView extends MVPView{

        void openSplashActivity();
    }

    interface HomePresenter<V extends HomeView> extends MVPPresenter<V>{

        String getEmailId();

        void setUserLoggedOut();
    }


}
