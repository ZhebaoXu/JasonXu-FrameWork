package com.jasonxu.appstructure.api;

import com.jasonxu.appstructure.api.apiIml.ApiVolley;
import com.jasonxu.appstructure.data.entity.LoginBean;
import com.jasonxu.appstructure.data.entity.UpdateBean;

/**
 * Created by jason_000 on 2016/8/22.
 * 网络请求方法单利封装类
 * 我们还可以在Api类中根据不同的接口方法调用不同的实现，比如对于登录我想用RESTFUL实现而对于版本更新我想用OkHttp实现等，这些底层的改动都不会影响上层的结构
 */
public final class Api implements IApi{

    private volatile static Api sInstance;

    private IApi mApi;

    private Api(){
        mApi = new ApiVolley();
    }

    public static Api getInstance(){
        if (null == sInstance){
            synchronized (Api.class) {
                sInstance = new Api();
            }
        }

        return sInstance;
    }

    @Override
    public void login(String user, String password, NetCallBack<LoginBean> c) {
        mApi.login(user,password,c);
    }

    @Override
    public void upgrade(String code, NetCallBack<UpdateBean> c) {
        mApi.upgrade(code,c);
    }
}
