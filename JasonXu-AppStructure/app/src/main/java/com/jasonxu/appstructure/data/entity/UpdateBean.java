package com.jasonxu.appstructure.data.entity;

/**
 * Created by jason_000 on 2016/8/22.
 *  更新用户信息数据实体类
 */
public class UpdateBean {

    private String mVersionName; //版本名
    private String mDescription; //版本描述
    private String mDownloadUrl; //安装包下载地址

    private int mVersionCode; //版本号
    private boolean isForce; //是否强制更新
}
