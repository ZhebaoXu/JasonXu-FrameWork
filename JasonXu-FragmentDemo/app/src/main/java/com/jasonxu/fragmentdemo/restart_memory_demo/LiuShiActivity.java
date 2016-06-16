package com.jasonxu.fragmentdemo.restart_memory_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by t_xuz on 6/13/16.
 * (流式关系)
 * //一个activity+多个fragment的时候,用fragments方式解决内存重启问题
 * 比如登录->注册/忘记密码->填写信息->跳转到主页Activity。这种情况下，
 * 用getFragments()的方式是最合适的，在你的Activity内（更好的方式是在你的所有"流程"基类Activity里）
 */
public class LiuShiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            if (fragments != null && fragments.size() > 0) {
                boolean showFlag = false;
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                for (int i = fragments.size() - 1; i >= 0; i--) {
                    Fragment fragment = fragments.get(i);
                    if (fragment != null) {
                        if (!showFlag) {//栈顶才show
                            transaction.show(fragment);
                            showFlag = true;
                        } else {
                            transaction.hide(fragment);
                        }
                    }
                }
                transaction.commit();
            }
        }
    }
}
