package org.emamotor.hfdp.observer.weather;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature_;
    private float humidity_;
    private Subject weatherData_;

    public CurrentConditionDisplay(Subject weatherData) {
        weatherData_ = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature_ = temp;
        humidity_ = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("現在の気象状況: 温度" + temperature_ + "度  湿度" + humidity_ + "%");
    }

}
