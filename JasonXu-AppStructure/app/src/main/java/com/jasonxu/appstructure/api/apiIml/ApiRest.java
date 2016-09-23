package com.jasonxu.appstructure.api.apiIml;

import com.jasonxu.appstructure.api.IApi;
import com.jasonxu.appstructure.api.NetCallBack;
import com.jasonxu.appstructure.data.entity.LoginBean;
import com.jasonxu.appstructure.data.entity.UpdateBean;

/**
 * Created by jason_000 on 2016/8/22.
 * RESTFUL 方式
 */
public class ApiRest implements IApi {

    @Override
    public void login(String user, String password, NetCallBack<LoginBean> c) {

    }

    @Override
    public void upgrade(String code, NetCallBack<UpdateBean> c) {

    }
}
