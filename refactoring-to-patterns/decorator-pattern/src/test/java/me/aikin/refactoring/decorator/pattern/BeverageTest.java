package me.aikin.refactoring.decorator.pattern;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class BeverageTest {
    @Test
    public void should_pay_1_when_buy_espresso() {
        Espresso espresso = new Espresso();
        assertTrue(espresso.cost() == 4.0);
    }

    @Test
    public void should_pay_5_when_buy_espresso_with_milk() {
        Espresso espresso = new Espresso();
        MilkBeverage milkBeverage = new MilkBeverage(espresso);
        assertTrue(milkBeverage.cost() == 5.0);
    }

    @Test
    public void should_pay_7_when_buy_espresso_with_mocha() {
        Espresso espresso = new Espresso();
        MochaBeverage mochaBeverage = new MochaBeverage(espresso);
        assertTrue(mochaBeverage.cost() == 7.0);
    }

    @Test
    public void should_pay_8_when_buy_espresso_with_milk_and_mocha() {
        Espresso espresso = new Espresso();
        MochaBeverage mochaBeverage = new MochaBeverage(espresso);

        MilkAndMochaBeverage milkAndMochaBeverage = new MilkAndMochaBeverage(mochaBeverage);
        assertTrue(milkAndMochaBeverage.cost() == 8.0);
    }

    @Test
    public void should_return_espresso_when_get_espresso_description() {
        Espresso espresso = new Espresso();

        assertTrue(Objects.equals(espresso.getDescription(), "Espresso"));
    }
}
