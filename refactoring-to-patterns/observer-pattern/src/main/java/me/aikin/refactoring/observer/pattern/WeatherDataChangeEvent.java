package me.aikin.refactoring.observer.pattern;

public class WeatherDataChangeEvent {
    private int temp;
    private int humidity;
    private int windPower;

    public WeatherDataChangeEvent(int temp, int humidity, int windPower) {
        this.temp = temp;
        this.humidity = humidity;
        this.windPower = windPower;
    }

    public int getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWindPower() {
        return windPower;
    }
}
