package me.aikin.refactoring.decorator.pattern;

/**
 * @author huisheng.jin
 * @version 2019/12/1.
 */
public class MochaBeverage extends Beverage {
    private Beverage beverage;

    protected MochaBeverage(Beverage beverage) {
        super(false, true);
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        return beverage.cost() + 3.0;
    }
}
