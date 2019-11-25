package me.aikin.refactoring.observer.pattern.subject;

import me.aikin.refactoring.observer.pattern.WeatherDataChangeEvent;
import me.aikin.refactoring.observer.pattern.observer.Observer;

/**
 * @author huisheng.jin
 * @version 2019/11/25.
 */
public interface Subject {
    void attach(Observer observer);
    void notify(WeatherDataChangeEvent weatherDataChangeEvent);
}
