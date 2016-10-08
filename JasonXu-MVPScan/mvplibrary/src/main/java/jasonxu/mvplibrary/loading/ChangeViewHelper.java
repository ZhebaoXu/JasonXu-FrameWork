package jasonxu.mvplibrary.loading;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by t_xuz on 10/8/16.
 * 控制显示view类
 */
public class ChangeViewHelper implements IChangeViewHelper{

    private View mView; //从外部调用传入的子页面该显示地方的viewGroup
    private View mCurrentView;
    private ViewGroup mParentView;
    private ViewGroup.LayoutParams mParams;
    private int mViewIndex;

    public ChangeViewHelper(View view){
        this.mView = view;
    }

    @Override
    public View getCurrentView() {
        return mCurrentView;
    }

    @Override
    public View inflateView(int layoutId) {
        return LayoutInflater.from(mView.getContext()).inflate(layoutId,null,false);
    }

    @Override
    public void showView(View view) {
        if (mParentView == null){
            initView();
        }

        mCurrentView = view;
        //不是那个view的时候才会去替换
        if (view != mParentView.getChildAt(mViewIndex)){
            ViewGroup parent = (ViewGroup) view.getParent();
            if (parent != null){
                parent.removeView(view);
            }
            mParentView.removeViewAt(mViewIndex);
            mParentView.addView(view,mViewIndex,mParams);
        }
    }

    @Override
    public Context getContext() {
        return mView.getContext();
    }

    private void initView(){
        mParams = mView.getLayoutParams();
        if (mView.getParent() != null){
            mParentView = (ViewGroup) mView.getParent();
        }else {
            mParentView = (ViewGroup) mView.getRootView().findViewById(android.R.id.content);
        }
        //获得当前mView的index
        int childCount = mParentView.getChildCount();
        for (int index=0;index<childCount;index++){
            if (mView == mParentView.getChildAt(index)){
                mViewIndex = index;
                break;
            }
        }
        mCurrentView = mView;
    }
}
