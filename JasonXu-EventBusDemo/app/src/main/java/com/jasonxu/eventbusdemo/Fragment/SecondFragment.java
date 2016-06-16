package com.jasonxu.eventbusdemo.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jasonxu.eventbusdemo.Fragment.evnets.ShowFragmentEvent;
import com.jasonxu.eventbusdemo.R;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by t_xuz on 6/15/16.
 */
public class SecondFragment extends BaseFragment{

    @BindView(R.id.btn_second)
    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_fragment_layout,container,false);
        ButterKnife.bind(this,view);
        return view;
    }


    @OnClick(R.id.btn_second)void  click(){
        EventBus.getDefault().post(new ShowFragmentEvent(new FirstFragment()));
    }
}
