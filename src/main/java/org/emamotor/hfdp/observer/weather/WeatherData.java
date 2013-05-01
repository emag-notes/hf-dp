package org.emamotor.hfdp.observer.weather;

import java.util.List;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature_;
    private float humidity_;
    private float pressure_;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature_, humidity_, pressure_);
        }
    }

    public void measurementsChanged() {
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
