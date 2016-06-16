package com.jasonxu.fragmentdemo.restart_memory_demo;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by t_xuz on 6/13/16.
 * 说明:
 * 1.show()，hide()最终是让Fragment的View setVisibility(true还是false)，不会调用生命周期；
 *replace()的话会销毁视图，即调用onDestoryView、onCreateView等一系列生命周期；
 * 2.你有一个很高的概率会再次使用当前的Fragment，建议使用show()，hide()，可以提高性能。
 *在我使用Fragment过程中，大部分情况下都是用show()，hide()，而不是replace()。
 */
public class BaseFragment extends Fragment{
    protected TestActivity mActivity;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (TestActivity)context;
    }

    /*
    * hide()跳转新的Fragment时，旧的Fragment回调onHiddenChanged()，
    * 不会回调onStop()等生命周期方法，而新的Fragment在创建时是不会回调onHiddenChanged()
    * */
    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
    }
}
