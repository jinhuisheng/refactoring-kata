package me.aikin.refactoring.observer.pattern.subject;

import me.aikin.refactoring.observer.pattern.WeatherDataChangeEvent;
import me.aikin.refactoring.observer.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huisheng.jin
 * @version 2019/11/25.
 */
public class WeatherDataSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notify(WeatherDataChangeEvent weatherDataChangeEvent) {
        observerList.forEach(observer ->
                observer.measurementsChanged(weatherDataChangeEvent));
    }
}
