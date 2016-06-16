package adsk.jasonxu_mvcdemo.model;

/**
 * Created by t_xuz on 6/12/16.
 */
public interface WeatherModel {

    void getWeatherInfo(String cityNum,WeatherListener weatherListener);
}
