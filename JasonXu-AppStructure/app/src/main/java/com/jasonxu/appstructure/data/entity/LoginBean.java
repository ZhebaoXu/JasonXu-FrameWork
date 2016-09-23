package com.jasonxu.appstructure.data.entity;

/**
 * Created by jason_000 on 2016/8/22.
 * 用户登录成功返回数据实体类
 */
public class LoginBean {

    private String mUserId;
    private String mPassWord;
    private String mName;
    private String mHeadImgUrl;
    private String mSex;
    private String mBirthDay;

    private long mRegisterTimeStamp;//用户注册时间戳
    private long mLastLoginTimeStamp; //用户上一次登录的时间戳

    private int mAge;

    public String getmUserId() {
        return mUserId;
    }

    public void setmUserId(String mUserId) {
        this.mUserId = mUserId;
    }

    public String getmPassWord() {
        return mPassWord;
    }

    public void setmPassWord(String mPassWord) {
        this.mPassWord = mPassWord;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmHeadImgUrl() {
        return mHeadImgUrl;
    }

    public void setmHeadImgUrl(String mHeadImgUrl) {
        this.mHeadImgUrl = mHeadImgUrl;
    }

    public String getmSex() {
        return mSex;
    }

    public void setmSex(String mSex) {
        this.mSex = mSex;
    }

    public String getmBirthDay() {
        return mBirthDay;
    }

    public void setmBirthDay(String mBirthDay) {
        this.mBirthDay = mBirthDay;
    }

    public long getmRegisterTimeStamp() {
        return mRegisterTimeStamp;
    }

    public void setmRegisterTimeStamp(long mRegisterTimeStamp) {
        this.mRegisterTimeStamp = mRegisterTimeStamp;
    }

    public long getmLastLoginTimeStamp() {
        return mLastLoginTimeStamp;
    }

    public void setmLastLoginTimeStamp(long mLastLoginTimeStamp) {
        this.mLastLoginTimeStamp = mLastLoginTimeStamp;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }
}
