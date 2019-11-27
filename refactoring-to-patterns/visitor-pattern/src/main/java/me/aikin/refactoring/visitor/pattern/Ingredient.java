package me.aikin.refactoring.visitor.pattern;

public class Ingredient implements Element {
    private NutritionInfo nutrition;

    public Ingredient(NutritionInfo nutrition) {
        this.nutrition = nutrition;
    }

    public void addToPot() {
    }

    public void addWater() {
    }

    public void addOil() {
    }

    public void smell() {
    }

    public int getHealthRating() {
        smell();
        return nutrition.getHealthRating();
    }

    public String getProtein() {
        return nutrition.getProtein() + " g";
    }

    public String getCalory() {
        return nutrition.getCalory() + " J";
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

