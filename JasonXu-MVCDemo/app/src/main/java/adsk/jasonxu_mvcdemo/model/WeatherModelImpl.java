package adsk.jasonxu_mvcdemo.model;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import adsk.jasonxu_mvcdemo.MVCDemoApplication;

/**
 * Created by t_xuz on 6/12/16.
 */
public class WeatherModelImpl implements WeatherModel{

    @Override
    public void getWeatherInfo(String cityNum, final WeatherListener weatherListener) {

        JsonObjectRequest weatherRequest = new JsonObjectRequest(Request.Method.GET, "www.baidu.com", null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                if(response != null){
                    weatherListener.onSuccess(response.toString());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (error!=null){
                    weatherListener.onFail(error);
                }
            }
        });

        MVCDemoApplication.getInstance().addToRequestQueue(weatherRequest,"weatherRequest");

    }
}
