package adsk.jasonxu_mvcdemo.model;

import com.android.volley.VolleyError;

/**
 * Created by t_xuz on 6/12/16.
 */
public interface WeatherListener {

    void onSuccess(String data);

    void onFail(VolleyError error);
}
