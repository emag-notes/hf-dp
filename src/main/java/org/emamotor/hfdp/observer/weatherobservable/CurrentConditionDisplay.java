package org.emamotor.hfdp.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable observable_;
    private float temperature_;
    private float humidity_;

    public CurrentConditionDisplay(Observable observable) {
        observable_ = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            temperature_ = weatherData.getTemperature();
            humidity_ = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("現在の気象状況: 温度" + temperature_ + "度  湿度" + humidity_ + "%");
    }

}
