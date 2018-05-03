package com.example.base.data;

public class DataManager {

    static SharedPrefsHelper mSharedPrefsHelper;
    static DataManager mDataManager;

    public DataManager(SharedPrefsHelper sharedPrefsHelper){
        mSharedPrefsHelper=sharedPrefsHelper;
    }


    public static DataManager getDataManager(){
        mDataManager=new DataManager(mSharedPrefsHelper);
        return mDataManager;
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

    public static void init(SharedPrefsHelper sharedPrefsHelper) {
        mSharedPrefsHelper=sharedPrefsHelper;
    }
}
