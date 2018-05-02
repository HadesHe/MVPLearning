package com.example.base.data;

public class DataManager {

    SharedPrefsHelper mSharedPrefsHelper;

    public DataManager(SharedPrefsHelper sharedPrefsHelper){
        mSharedPrefsHelper=sharedPrefsHelper;
    }

    public void clear(){
        mSharedPrefsHelper.clear();
    }

    public void saveEmailId(String email){
        mSharedPrefsHelper.putEmail(email);
    }

    public String getEmailId(){
        return mSharedPrefsHelper.getEmail();
    }

    public void setLoggedIn(){
        mSharedPrefsHelper.setLoggedInMode(true);
    }

    public boolean getLoggedInMode(){
        return mSharedPrefsHelper.getLoggedInMode();
    }

}