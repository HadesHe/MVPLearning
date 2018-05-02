package com.example.base.ui.base;

import com.example.base.data.DataManager;

public class BasePresenter<V extends MVPView> implements MVPPresenter<V> {
    private final DataManager mDataManager;
    private V mMvpView;

    public BasePresenter(DataManager dataManager){
        mDataManager=dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView=mvpView;
    }

    public V getMVPView(){
        return mMvpView;
    }

    public DataManager getDataManager(){
        return mDataManager;
    }
}
