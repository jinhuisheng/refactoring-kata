package me.aikin.refactoring.observer.pattern.observer;

import me.aikin.refactoring.observer.pattern.WeatherDataChangeEvent;

public class WateringMachine implements Observer {

    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    private void start() {
        this.status = true;
    }

    @Override
    public void measurementsChanged(WeatherDataChangeEvent weatherDataChangeEvent) {
        if (weatherDataChangeEvent.getTemp() > 10 && weatherDataChangeEvent.getHumidity() < 55 && weatherDataChangeEvent.getWindPower() < 4) {
            start();
        }

    }
}
