package com.example.home;

import com.example.base.data.DataManager;
import com.example.base.ui.base.BasePresenter;

public class HomePresenterIml<V extends HomeContract.HomeView> extends BasePresenter<V> implements HomeContract.HomePresenter<V>{
    public HomePresenterIml(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMVPView().openSplashActivity();

    }
}
