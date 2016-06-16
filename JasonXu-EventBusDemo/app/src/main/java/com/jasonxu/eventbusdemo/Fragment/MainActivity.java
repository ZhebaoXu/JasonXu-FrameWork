package com.jasonxu.eventbusdemo.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jasonxu.eventbusdemo.Fragment.evnets.ShowFragmentEvent;
import com.jasonxu.eventbusdemo.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by t_xuz on 6/15/16.
 *
 */
public class MainActivity extends AppCompatActivity{

    @BindView(R.id.btn_first)
    Button button;
    @BindView(R.id.tv_t)
    TextView textView;
    @BindView(R.id.container)
    RelativeLayout container;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity_layout);
        ButterKnife.bind(this);

        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }

        textView.setText("88888888");
    }

    @OnClick(R.id.btn_first)void btnClick(){
        button.setText("ceshi");
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new SecondFragment(),"2").commit();
    }


    @Subscribe
    public void onEvent(ShowFragmentEvent event){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,event.getFirstFragment()).commit();
    }

    @Override
    protected void onDestroy() {
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        super.onDestroy();
    }
}
