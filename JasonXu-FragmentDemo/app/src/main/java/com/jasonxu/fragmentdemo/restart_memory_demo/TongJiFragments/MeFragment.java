package com.jasonxu.fragmentdemo.restart_memory_demo.TongJiFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jasonxu.fragmentdemo.restart_memory_demo.BaseFragment;

/**
 * Created by t_xuz on 6/13/16.
 */
public class MeFragment extends BaseFragment{

    public static MeFragment newInstance(){
        return new MeFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
