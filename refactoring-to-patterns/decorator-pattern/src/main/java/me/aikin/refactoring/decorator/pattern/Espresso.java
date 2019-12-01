package me.aikin.refactoring.decorator.pattern;

/**
 * @author huisheng.jin
 * @version 2019/12/1.
 */
public class Espresso extends Beverage {
    protected Espresso() {
        super(false, false);
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 4;
    }
}
