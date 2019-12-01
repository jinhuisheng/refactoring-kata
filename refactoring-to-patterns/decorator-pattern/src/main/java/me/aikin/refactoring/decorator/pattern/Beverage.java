package me.aikin.refactoring.decorator.pattern;

public abstract class Beverage {
    private  boolean milk;
    private  boolean mocha;

    protected Beverage(boolean milk, boolean mocha) {
        this.milk = milk;
        this.mocha = mocha;
    }

    public String getDescription() {
        return "";
    }

    public abstract double cost();
}
