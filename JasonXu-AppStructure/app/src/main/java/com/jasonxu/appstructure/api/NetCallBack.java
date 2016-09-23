package com.jasonxu.appstructure.api;

/**
 * Created by jason_000 on 2016/8/22.
 * 网络请求完成后的回调接口
 */
public interface NetCallBack<T> {

    void onFinish(boolean isSuccess,Response<T> response,String error);
}
