package me.aikin.refactoring.observer.pattern.observer;

import me.aikin.refactoring.observer.pattern.WeatherDataChangeEvent;

/**
 * @author huisheng.jin
 * @version 2019/11/25.
 */
public interface Observer {
    void measurementsChanged(WeatherDataChangeEvent weatherDataChangeEvent);
}
