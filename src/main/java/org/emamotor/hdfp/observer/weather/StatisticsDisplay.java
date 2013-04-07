package org.emamotor.hdfp.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp_ = 0.0f;
    private float minTemp_ = 200;
    private float tempSum_ = 0.0f;
    private int numReadings_;
    private Subject weatherData_;

    public StatisticsDisplay(Subject weatherData) {
        weatherData_ = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
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

    @Override
    public void display() {
        System.out.println("平均/最高/最低気温: " + (tempSum_ / numReadings_) + "/" + maxTemp_ + "/" + minTemp_);
    }

}
