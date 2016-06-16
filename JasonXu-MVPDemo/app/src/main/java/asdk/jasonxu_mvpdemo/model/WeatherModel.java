package asdk.jasonxu_mvpdemo.model;

import asdk.jasonxu_mvpdemo.presenter.OnWeatherListener;

/**
 * Created by t_xuz on 6/9/16.
 */
public interface WeatherModel {

    void loadWeather(String cityNo, OnWeatherListener listener);
}
