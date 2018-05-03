package com.example.home;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.base.data.DataManager;

public class HomeActivity extends AppCompatActivity implements HomeContract.HomeView {

    private HomeContract.HomePresenter<HomeContract.HomeView> homePresenter;
    private TextView textViewShow;
    private Button buttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homePresenter=new HomePresenterIml(DataManager.getDataManager());
        homePresenter.onAttach(this);

        textViewShow=findViewById(R.id.textViewShow);
        buttonLogout=findViewById(R.id.buttonLogout);
        textViewShow.setText(homePresenter.getEmailId());
        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homePresenter.setUserLoggedOut();
            }
        });


    }


    @Override
    public void openSplashActivity() {
    }

    public static Intent getStartIntent(Context context) {
        Intent intent=new Intent(context,HomeActivity.class);
        return intent;
    }
}
