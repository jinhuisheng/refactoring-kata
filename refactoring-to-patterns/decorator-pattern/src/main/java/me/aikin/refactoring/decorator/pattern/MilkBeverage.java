package me.aikin.refactoring.decorator.pattern;

/**
 * @author huisheng.jin
 * @version 2019/12/1.
 */
public class MilkBeverage extends Beverage {
    private Beverage beverage;

    protected MilkBeverage(Beverage beverage) {
        super(true, false);
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        return beverage.cost() + 1.0;
    }
}
