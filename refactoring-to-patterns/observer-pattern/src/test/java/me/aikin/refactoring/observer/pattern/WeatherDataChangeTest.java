package me.aikin.refactoring.observer.pattern;


import me.aikin.refactoring.observer.pattern.observer.ReapingMachine;
import me.aikin.refactoring.observer.pattern.observer.SeedingMachine;
import me.aikin.refactoring.observer.pattern.observer.WateringMachine;
import me.aikin.refactoring.observer.pattern.subject.Subject;
import me.aikin.refactoring.observer.pattern.subject.WeatherDataSubject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WeatherDataChangeTest {

    private final SeedingMachine seedingMachine = new SeedingMachine();
    private final ReapingMachine reapingMachine = new ReapingMachine();
    private final WateringMachine wateringMachine = new WateringMachine();
    private final Subject subject;

    public WeatherDataChangeTest() {
        subject = new WeatherDataSubject();
        subject.attach(seedingMachine);
        subject.attach(reapingMachine);
        subject.attach(wateringMachine);
    }


    @Test
    public void seeding_machine_should_start_if_temperature_over_5_degree() {
        subject.notify(new WeatherDataChangeEvent(10, 0, 0));

        assertTrue(seedingMachine.getStatus());
    }

    @Test
    public void reaping_machine_should_start_if_temperature_over_5_degree_and_humidity_over_65() {
        subject.notify(new WeatherDataChangeEvent(10, 70, 0));
        assertTrue(reapingMachine.getStatus());
    }

    @Test
    public void water_machine_should_start_if_temperature_over_10_degree_and_humidity_less_than_55_and_wind_power_less_than_4() {
        subject.notify(new WeatherDataChangeEvent(12, 50, 2));
        assertTrue(wateringMachine.getStatus());
    }

}