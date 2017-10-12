package com.wen.fulai.demomvp.base;

/**
 * Created by fulai on 2017/10/11.
 */

/**
 * view基类,并传入presenter范型
 *
 * @param <T>
 */
public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
