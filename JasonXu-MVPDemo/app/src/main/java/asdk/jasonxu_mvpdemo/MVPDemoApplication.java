package asdk.jasonxu_mvpdemo;

import android.app.Application;
import android.text.TextUtils;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by t_xuz on 6/9/16.
 * //
 */
public class MVPDemoApplication extends Application {

    private static final String REQUEST_TAG = "VolleyRequest";
    private static MVPDemoApplication mInstance;
    private static RequestQueue mRequestQueue;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;

    }

    public synchronized static MVPDemoApplication getInstance() {
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }

    /*
    * 添加请求对象到请求队列中
    * */
    public void addToRequestQueue(Request mRequest, String tag) {

        mRequest.setTag(TextUtils.isEmpty(tag) ? REQUEST_TAG : tag);
        //设置请求超时时间,并设置请求超时后是否重复去请求,并提供重复请求次数
        mRequest.setRetryPolicy(new DefaultRetryPolicy(10 * 1000, 1, 1.0f));

        getRequestQueue().add(mRequest);

    }

    /*
  * 添加请求对象到请求队列中
  * */
    public void addToRequestQueue(Request mRequest) {
        //设置请求超时时间,并设置请求超时后是否重复去请求,并提供重复请求次数
        mRequest.setRetryPolicy(new DefaultRetryPolicy(10 * 1000, 1, 1.0f));

        getRequestQueue().add(mRequest);
    }

    /*
    * 根据请求tag去取消某次请求
    * */
    public void cancelPendingRequest(String tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }

}
