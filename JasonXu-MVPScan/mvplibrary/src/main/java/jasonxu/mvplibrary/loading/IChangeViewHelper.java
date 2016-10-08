package jasonxu.mvplibrary.loading;

import android.content.Context;
import android.view.View;

/**
 * Created by t_xuz on 10/8/16.
 */
public interface IChangeViewHelper {

    View getCurrentView();

    View inflateView(int layoutId);

    void showView(View view);

    Context getContext();
}
