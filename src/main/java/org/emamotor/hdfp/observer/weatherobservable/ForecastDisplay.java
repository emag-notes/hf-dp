package org.emamotor.hdfp.observer.weatherobservable;


import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private Observable observable_;
    private float currentPressure_ = 29.92f;
    private float lastPressure_;

    public ForecastDisplay(Observable observable) {
        observable_ = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            lastPressure_ = currentPressure_;
            currentPressure_ = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("予報: ");

        if (currentPressure_ > lastPressure_) {
            System.out.println("天気は良くなります!");
        } else if (currentPressure_ == lastPressure_) {
            System.out.println("ほとんど同じです");
        } else {
            System.out.println("より寒く雨模様の天候に注意してください");
        }

    }

}
