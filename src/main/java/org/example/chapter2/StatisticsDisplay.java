package org.example.chapter2;

public class StatisticsDisplay implements Observer, DisplayElement {
    private double maxTemp = 0.0D;
    private double minTemp = 200D;
    private double tempSum = 0.0D;
    private int numReadings;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update() {
        tempSum += this.weatherData.getTemperature();
        numReadings++;

        if (this.weatherData.getTemperature() > maxTemp) {
            maxTemp = this.weatherData.getTemperature();
        }

        if (this.weatherData.getTemperature() < minTemp) {
            minTemp = this.weatherData.getTemperature();
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
