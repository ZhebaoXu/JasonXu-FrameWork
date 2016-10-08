package jasonxu.mvplibrary.loading;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import jasonxu.mvplibrary.R;

/**
 * Created by t_xuz on 10/8/16.
 * 思路说明:
 * 1.外部使用规则:该类是在baseActivity或者baseFragment里的onCreateView里new出的一个对象,也就是说,所有传进来的根view都是setContentView里的根view或者
 * setContentView该显示的地方的viewGroup.而这里传进去的viewGroup都是子类来获得,因为不同的页面会有不同的要显示的view的地方;
 * 2.内部实现规则:ChangeViewHelper实现具体的业务逻辑函数,该类就要是根据不同的条件来显示不同的视图,由对应的情况来决定调用哪个方法(由外部使用调用)
 */
public class ChangeViewHelperController implements IChangeViewHelperController{
    private IChangeViewHelper mChangeViewHelper;

    public ChangeViewHelperController(View view){
      this(new ChangeViewHelper(view));
    }

    public ChangeViewHelperController(IChangeViewHelper changeViewHelper){
        this.mChangeViewHelper = changeViewHelper;
    }

    @Override
    public void showNetWorkErrorView(View.OnClickListener listener) {
        View layout = mChangeViewHelper.inflateView(R.layout.message);
        TextView textView = (TextView) layout.findViewById(R.id.message_info);
        textView.setText(mChangeViewHelper.getContext().getResources().getString(R.string.common_no_network_msg));

        ImageView imageView = (ImageView) layout.findViewById(R.id.message_icon);
        imageView.setImageResource(R.drawable.ic_exception);

        if (null != listener) {
            layout.setOnClickListener(listener);
        }
        mChangeViewHelper.showView(layout);
    }

    @Override
    public void showErrorView(String errorMsg, View.OnClickListener listener) {

    }

    @Override
    public void showEmptyView(String errorMsg, View.OnClickListener listener) {

    }

    @Override
    public void showLoadingView(String msg) {

    }

}
