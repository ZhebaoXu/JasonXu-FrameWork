package com.jasonxu.appstructure.api;

import com.jasonxu.appstructure.data.entity.LoginBean;
import com.jasonxu.appstructure.data.entity.UpdateBean;


/**
 * Created by jason_000 on 2016/8/22.
 * 网络请求方法接口
 *
 */
public interface IApi {

    //用户登录
    void login(String user, String password, NetCallBack<LoginBean> c);

    //应用更新
    void upgrade(String code, NetCallBack<UpdateBean> c);
}
