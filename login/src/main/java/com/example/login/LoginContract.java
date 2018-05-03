package com.example.login;

import com.example.base.ui.base.MVPPresenter;
import com.example.base.ui.base.MVPView;

public interface LoginContract {
    interface LoginView extends MVPView{

        void openMainActivity();
    }

    interface LoginPresenter<V extends LoginView> extends MVPPresenter<V>{

        void startLogin(String emailId);
    }
}
