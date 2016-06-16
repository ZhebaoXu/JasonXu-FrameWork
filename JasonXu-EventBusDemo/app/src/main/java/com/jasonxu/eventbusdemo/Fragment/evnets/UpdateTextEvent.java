package com.jasonxu.eventbusdemo.Fragment.evnets;

/**
 * Created by t_xuz on 6/15/16.
 */
public class UpdateTextEvent {

    private String mTitle;

    public UpdateTextEvent(String mTitle){
        this.mTitle = mTitle;
    }

    public String getTitle() {
        return mTitle;
    }
}
