package com.jasonxu.appstructure.api;

/**
 * Created by jason_000 on 2016/8/22.
 *
 */
public final class Response<T> {

    public T mData;// 数据实体

    public String mResponseMsg; //响应消息文本，在mResponseCode不等于200的时候该字段才会有数据

    public long mResponseTimeStamp ; //响应请求的时间戳

    public int mResponseCode; //具体的响应码，200表示成功，由服务器规定
}
