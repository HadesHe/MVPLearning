package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.base.data.DataManager;
import com.example.base.utils.CommonUtils;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView {

    private LoginContract.LoginPresenter<LoginContract.LoginView> loginPresenter;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initPresenter();
        initView();
    }

    private void initView() {
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextPassword=findViewById(R.id.editTextPassword);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtonClick();
            }
        });
    }

    private void onLoginButtonClick() {
        String emailId=editTextEmail.getText().toString();
        String password=editTextPassword.getText().toString();

        if (!CommonUtils.isEmailValid(emailId)) {
            showLongToast("Enter corrent Email");
            return;
        }

        if(password==null||password.isEmpty()){
            showLongToast("Enter password");
            return;
        }

        loginPresenter.startLogin(emailId);

    }

    private void showLongToast(String content) {
        Toast.makeText(LoginActivity.this,content,Toast.LENGTH_LONG).show();
    }

    private void initPresenter() {
        DataManager dataManager= DataManager.getDataManager();
        loginPresenter=new LoginPreseneterImp(dataManager);

        loginPresenter.onAttach(this);
    }

    @Override
    public void openMainActivity() {
// TODO: 2018/5/3 start home
    }

    public static Intent getStartIntent(Context context) {
        Intent intent=new Intent(context,LoginActivity.class);
        return intent;
    }
}
