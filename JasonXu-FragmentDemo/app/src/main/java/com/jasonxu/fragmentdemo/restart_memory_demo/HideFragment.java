package com.jasonxu.fragmentdemo.restart_memory_demo;

import android.support.v4.app.Fragment;

/**
 * Created by t_xuz on 6/13/16.
 */
public class HideFragment extends Fragment {

    public static Fragment newInstance(){
        Fragment hideFragment = new HideFragment();
        return hideFragment;
    }
}
