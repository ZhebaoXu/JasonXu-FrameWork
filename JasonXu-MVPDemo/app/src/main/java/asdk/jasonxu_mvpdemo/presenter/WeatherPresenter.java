package asdk.jasonxu_mvpdemo.presenter;

import asdk.jasonxu_mvpdemo.model.WeatherModel;
import asdk.jasonxu_mvpdemo.model.WeatherModelImpl;
import asdk.jasonxu_mvpdemo.view.WeatherViewInterface;

/**
 * Created by t_xuz on 6/9/16.
 * 先从Presenter开始着手,Presenter是一个中间人(中介),分别需要持有M与V的引用,然后才能进行通信
 */
public class WeatherPresenter {

    //WeatherView接口,代表View接口角色,通常都是在View中(如Activity里)通过构造器,把View的引用传入presenter里
    WeatherViewInterface mWeatherView;
    //获取天气数据的Model,也就是Model角色
    WeatherModel mWeatherModel = new WeatherModelImpl();

    public WeatherPresenter(WeatherViewInterface viewInterface){
        mWeatherView = viewInterface;
    }

    public void getWeatherInfo(){

    }


}
