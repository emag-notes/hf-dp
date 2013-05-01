package org.emamotor.hfdp.observer.weatherobservable;


import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Observable observable_;
    private float maxTemp_ = 0.0f;
    private float minTemp_ = 200;
    private float tempSum_ = 0.0f;
    private int numReadings_;

    public StatisticsDisplay(Observable observable) {
        observable_ = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            float temp = weatherData.getTemperature();
            tempSum_ += temp;
            numReadings_++;

            if (temp > maxTemp_) {
                maxTemp_ = temp;
            }

            if (temp < minTemp_) {
                minTemp_ = temp;
            }

            display();
        }

    }

    @Override
    public void display() {
        System.out.println("平均/最高/最低気温: " + (tempSum_ / numReadings_) + "/" + maxTemp_ + "/" + minTemp_);
    }

}
