package jasonxu.mvplibrary.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jasonxu.mvplibrary.loading.ChangeViewHelperController;

/**
 * Created by t_xuz on 10/8/16.
 *
 */
public abstract class BaseAppActivity extends AppCompatActivity{

    private ChangeViewHelperController mChangeViewHelperController;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getLoadingTargetView() != null) {
            mChangeViewHelperController = new ChangeViewHelperController(getLoadingTargetView());
        }
    }

    /**
     * get loading target view
     */
    protected abstract View getLoadingTargetView();

    protected void toggleShowNetErrorView(boolean toggle, View.OnClickListener listener){
        if (null == mChangeViewHelperController){
            throw new IllegalArgumentException("You must return a right target view for loading");
        }

        if (toggle){
            mChangeViewHelperController.showNetWorkErrorView(listener);
        }
    }
}
