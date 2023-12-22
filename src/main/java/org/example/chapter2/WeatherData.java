package org.example.chapter2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
    private double temperature;
    private double humidity;
    private double pressure;
    private final List<Observer> observerList = new ArrayList<>();

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    private void notifyObservers() {
        observerList.forEach(Observer::update);
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
