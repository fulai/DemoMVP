package com.wen.fulai.demomvp.login;

/**
 * Created by fulai on 2017/10/11.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View mView;

    public LoginPresenter(LoginContract.View mView) {
        this.mView = mView;
        mView.setPresenter(this);
    }


    @Override
    public void start() {

    }

    @Override
    public void login(String name, String pwd) {
        if (name.equals("fulai") && pwd.equals("123")) {
            mView.loginSuccessd();
        } else {
            mView.loginFailed("用户名或者密码错误");
        }
    }
}
