package me.aikin.refactoring.observer.pattern.observer;

import me.aikin.refactoring.observer.pattern.WeatherDataChangeEvent;

public class ReapingMachine implements Observer {
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    private void start() {
        this.status = true;
    }

    @Override
    public void measurementsChanged(WeatherDataChangeEvent weatherDataChangeEvent) {
        if (weatherDataChangeEvent.getTemp() > 5 && weatherDataChangeEvent.getHumidity() > 65) {
            start();
        }

    }
}
