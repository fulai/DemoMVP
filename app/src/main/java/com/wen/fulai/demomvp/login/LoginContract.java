package com.wen.fulai.demomvp.login;

import com.wen.fulai.demomvp.base.BasePresenter;
import com.wen.fulai.demomvp.base.BaseView;

/**
 * Created by fulai on 2017/10/11.
 * 管理view和presenter
 *
 */

public interface LoginContract {

    interface View extends BaseView<Presenter> {
        String getUserName();
        String getUserPwd();
        void loginSuccessd();
        void loginFailed(String msg);
    }

    interface Presenter extends BasePresenter {
        void login(String name, String pwd);
    }
}
