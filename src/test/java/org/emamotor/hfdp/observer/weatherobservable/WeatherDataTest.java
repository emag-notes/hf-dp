package org.emamotor.hfdp.observer.weatherobservable;

import org.junit.Test;

public class WeatherDataTest {

    @Test
    public void WeatherData_setMeasurementsでObserverに通知する() {
        WeatherData sut = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(sut);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(sut);
        ForecastDisplay forecastDisplay = new ForecastDisplay(sut);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(sut);

        sut.setMeasurements(27, 65, 30.4f);
        sut.setMeasurements(28, 70, 29.2f);
        sut.setMeasurements(26, 90, 29.2f);

    }
}
