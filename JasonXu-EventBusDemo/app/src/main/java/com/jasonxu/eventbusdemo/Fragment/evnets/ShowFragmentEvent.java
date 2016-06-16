package com.jasonxu.eventbusdemo.Fragment.evnets;

import com.jasonxu.eventbusdemo.Fragment.FirstFragment;

/**
 * Created by t_xuz on 6/15/16.
 */
public class ShowFragmentEvent {

    private FirstFragment firstFragment;

    public ShowFragmentEvent(FirstFragment firstFragment){
        this.firstFragment = firstFragment;
    }

    public FirstFragment getFirstFragment(){
        return firstFragment;
    }
}
