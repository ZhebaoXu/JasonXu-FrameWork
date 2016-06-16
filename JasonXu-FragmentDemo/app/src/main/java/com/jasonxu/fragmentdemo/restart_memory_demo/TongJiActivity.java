package com.jasonxu.fragmentdemo.restart_memory_demo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jasonxu.fragmentdemo.R;
import com.jasonxu.fragmentdemo.restart_memory_demo.TongJiFragments.ContactFragment;
import com.jasonxu.fragmentdemo.restart_memory_demo.TongJiFragments.MeFragment;
import com.jasonxu.fragmentdemo.restart_memory_demo.TongJiFragments.MsgFragment;

/**
 * Created by t_xuz on 6/13/16.
 * 说明:
 * 选择findFragmentByTag()恢复
 * 如果你的fragment不是"流程"关系而是"同级"关系,如:
 * QQ的主界面，“消息”、“联系人”、“动态”，这3个Fragment属于同级关系，就不适合用fragments方式来解决内存重启现象了.
 * 正确的做法是在onSaveInstanceState()内保存当前所在Fragment的tag或者下标，在onCreate()是恢复的时候，隐藏其它2个Fragment。
 *
 * 注意:当然在“同级”关系中，使用getFragments()恢复也是可以的。
 */
public class TongJiActivity extends AppCompatActivity {
    public static final String KEY_INDEX = "key_index";
    ContactFragment contactFragment;
    MsgFragment msgFragment;
    MeFragment meFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        if (savedInstanceState != null) {//内存重启时调用
            contactFragment = (ContactFragment) getSupportFragmentManager().findFragmentByTag(contactFragment.getClass().getName());
            msgFragment = (MsgFragment) getSupportFragmentManager().findFragmentByTag(msgFragment.getClass().getName());
            meFragment = (MeFragment) getSupportFragmentManager().findFragmentByTag(meFragment.getClass().getName());

            int index = savedInstanceState.getInt(KEY_INDEX);
            // 根据下标判断离开前是显示哪个Fragment，
            // 这里省略判断代码，假设离开前是ConactFragment
            // 解决重叠问题
            getSupportFragmentManager().beginTransaction()
                    .show(contactFragment)
                    .hide(msgFragment)
                    .hide(meFragment)
                    .commit();
        } else {  // 正常时
            msgFragment = MsgFragment.newInstance();
            contactFragment = ContactFragment.newInstance();
            meFragment = MeFragment.newInstance();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, msgFragment, msgFragment.getClass().getName())
                    .add(R.id.container, contactFragment, contactFragment.getClass().getName())
                    .add(R.id.container, meFragment, meFragment.getClass().getName())
                    .hide(contactFragment)
                    .hide(meFragment)
                    .commit();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        int index = 0;
        // 保存当前Fragment的下标
        outState.putInt(KEY_INDEX, index);
    }
}
