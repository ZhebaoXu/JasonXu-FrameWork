package com.jasonxu.eventbusdemo.Fragment;

import android.support.v4.app.Fragment;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by t_xuz on 6/15/16.
 */
public class BaseFragment extends Fragment {

    @Override
    public void onResume() {

       /* if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }*/
        super.onResume();
    }


    @Override
    public void onPause() {
        /*if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }*/
        super.onPause();
    }

}
