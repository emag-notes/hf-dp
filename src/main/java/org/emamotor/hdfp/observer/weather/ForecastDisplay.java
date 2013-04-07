package org.emamotor.hdfp.observer.weather;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure_ = 29.92f;
    private float lastPressure_;
    private Subject weatherData_;

    public ForecastDisplay(Subject weatherData) {
        weatherData_ = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure_ = currentPressure_;
        currentPressure_ = pressure;

        display();
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
