package com.jasonxu.fragmentdemo.restart_memory_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.jasonxu.fragmentdemo.R;

import java.util.List;

/**
 * Created by t_xuz on 6/13/16.
 * //注意:
 * 1.什么是内存重启?
 * 当app进入后台,由于系统内存低下,系统会杀死这个进入后台的app,回收系统资源供其他app使用,当用户
 * 再次点击之前进入后台的app,就会重启应用,这种情况简称"内存重启",(屏幕旋转等配置变化也会造成当前Activity重启，本质与“内存重启”类似)
 */
public class TestActivity extends AppCompatActivity {

    TargetFragment targetFragment;
    HideFragment hideFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {//"内存重启"时调用
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            for (Fragment fragment : fragments) {
                if (fragment instanceof TargetFragment) {
                    targetFragment = (TargetFragment) fragment;
                } else if (fragment instanceof HideFragment) {
                    hideFragment = (HideFragment) fragment;
                }
            }
            //解决内存重启现象
            getSupportFragmentManager().beginTransaction()
                    .show(targetFragment)
                    .hide(hideFragment)
                    .commit();

        } else {//正常时
            targetFragment = (TargetFragment) TargetFragment.newInstance();
            hideFragment = (HideFragment)HideFragment.newInstance();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container,targetFragment)
                    .add(R.id.container,hideFragment)
                    .hide(hideFragment)
                    .commit();
        }

   /*     if (savedInstanceState != null) {  // “内存重启”时调用
            targetFragment = getSupportFragmentManager().findFragmentByTag(targetFragment.getClass().getName);
            hideFragment = getSupportFragmentManager().findFragmentByTag(hideFragment.getClass().getName);
            // 解决重叠问题
            getFragmentManager().beginTransaction()
                    .show(targetFragment)
                    .hide(hideFragment)
                    .commit();
        }else{  // 正常时
            targetFragment = TargetFragment.newInstance();
            hideFragment = HideFragment.newInstance();

            getFragmentManager().beginTransaction()
                    .add(R.id.container, targetFragment, targetFragment.getClass().getName())
                    .add(R.id,container,hideFragment,hideFragment.getClass().getName())
                    .hide(hideFragment)
                    .commit();
        }*/
    }
}
