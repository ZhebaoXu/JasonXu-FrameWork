package adsk.jasonxu_mvcdemo.javabean;

import java.io.Serializable;

/**
 * Created by t_xuz on 6/12/16.
 */
public class Weather implements Serializable{

    private String mCityName;
    private String mCityState;

    public String getmCityState() {
        return mCityState;
    }

    public void setmCityState(String mCityState) {
        this.mCityState = mCityState;
    }

    public String getmCityName() {
        return mCityName;
    }

    public void setmCityName(String mCityName) {
        this.mCityName = mCityName;
    }
}
