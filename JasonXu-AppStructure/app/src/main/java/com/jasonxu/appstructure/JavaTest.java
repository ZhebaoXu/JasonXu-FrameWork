package com.jasonxu.appstructure;

import com.jasonxu.appstructure.api.Api;
import com.jasonxu.appstructure.api.NetCallBack;
import com.jasonxu.appstructure.api.Response;
import com.jasonxu.appstructure.data.entity.LoginBean;

/**
 * Created by jason_000 on 2016/8/22.
 * 模拟登录接口
 */
public class JavaTest {

    public static void main(String[] args){
        Api.getInstance().login("JasonXu", "123456", new NetCallBack<LoginBean>() {
            @Override
            public void onFinish(boolean isSuccess, Response<LoginBean> response, String error) {
                if (isSuccess){
                    int code  = response.mResponseCode;
                    if (code == 200){
                        String user = response.mData.getmUserId();
                        //...结构loginBean里的数据
                        long registerTimeStamp = response.mData.getmLastLoginTimeStamp();
                    }else {
                        System.out.print(response.mResponseMsg);
                    }
                }else {
                    System.out.print(error);
                }
            }
        });
    }
}
