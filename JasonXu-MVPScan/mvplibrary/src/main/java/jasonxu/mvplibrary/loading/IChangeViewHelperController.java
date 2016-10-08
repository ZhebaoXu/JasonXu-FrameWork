package jasonxu.mvplibrary.loading;

import android.view.View;

/**
 * Created by t_xuz on 10/8/16.
 *
 */
public interface IChangeViewHelperController {

    void showNetWorkErrorView(View.OnClickListener listener);//net error view

    void showErrorView(String errorMsg,View.OnClickListener listener);       //other error view

    void showEmptyView(String errorMsg,View.OnClickListener listener);       //empty view

    void showLoadingView(String msg);     //loading view
}
