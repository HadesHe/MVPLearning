package com.example.base.ui.base;

public interface MVPPresenter<V extends MVPView> {

    void onAttach(V mvpView);
}
