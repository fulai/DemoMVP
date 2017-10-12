package com.wen.fulai.demomvp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wen.fulai.demomvp.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.View, View.OnClickListener {

    private EditText etName, etPwd;
    private Button btnLogin;

    private LoginContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mPresenter = new LoginPresenter(this);
        initView();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.start();
    }

    private void initView() {
        etName = (EditText) findViewById(R.id.et_name);
        etPwd = (EditText) findViewById(R.id.et_pwd);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        //mPresenter = presenter;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                mPresenter.login(getUserName(), getUserPwd());
                break;
        }
    }

    @Override
    public String getUserName() {
        return etName.getText().toString().trim();
    }

    @Override
    public String getUserPwd() {
        return etPwd.getText().toString().trim();
    }

    @Override
    public void loginSuccessd() {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
