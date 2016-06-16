package com.jasonxu.eventbusdemo.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.jasonxu.eventbusdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by t_xuz on 6/15/16.
 */
public class FirstFragment extends BaseFragment {


    @BindView(R.id.btn_first)
    Button btn_first;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment_layout,container,false);
        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick(R.id.btn_first)void btnFirst(){
        Toast.makeText(getActivity(),"nidatetete",Toast.LENGTH_LONG).show();
    }


}
