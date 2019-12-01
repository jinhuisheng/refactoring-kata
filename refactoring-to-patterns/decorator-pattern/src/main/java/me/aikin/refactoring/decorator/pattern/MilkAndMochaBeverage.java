package me.aikin.refactoring.decorator.pattern;

/**
 * @author huisheng.jin
 * @version 2019/12/1.
 */
public class MilkAndMochaBeverage extends Beverage {
    private Beverage beverage;

    protected MilkAndMochaBeverage(Beverage beverage) {
        super(true, true);
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        return beverage.cost() + 1.0;
    }
}
