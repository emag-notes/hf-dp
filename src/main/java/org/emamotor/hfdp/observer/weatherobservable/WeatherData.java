package org.emamotor.hfdp.observer.weatherobservable;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature_;
    private float humidity_;
    private float pressure_;

    public WeatherData() {}

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        temperature_ = temperature;
        humidity_ = humidity;
        pressure_ = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature_;
    }

    public float getHumidity() {
        return humidity_;
    }

    public float getPressure() {
        return pressure_;
    }

}
