package com.example.login;

import com.example.base.data.DataManager;
import com.example.base.ui.base.BasePresenter;

public class LoginPreseneterImp<V extends LoginContract.LoginView> extends BasePresenter<V> implements LoginContract.LoginPresenter<V> {
    public LoginPreseneterImp(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMVPView().openMainActivity();
    }
}
