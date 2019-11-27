package me.aikin.refactoring.visitor.pattern;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MenuItemTest {
    private static Ingredient flour = CreateFlour();
    private static Ingredient yolk = CreateYolk();
    private static MenuItem moonCake = CreateMoonCake();

    @Test
    public void should_calc_health_rating_Ingredient() {
        assertEquals(1, flour.getHealthRating());
    }

    @Test
    public void should_calc_protein_for_Ingredient() {
        assertEquals("100.0 g", flour.getProtein());
    }

    @Test
    public void should_calc_calory_for_Ingredient() {
        assertEquals("10 J", flour.getCalory());
    }

    @Test
    public void should_calc_health_rating_for_MenuItem() {
        List<Object> healthRatings = moonCake.accept(new getHealthRatingVisitor());
        assertEquals(2, healthRatings.size());
        assertTrue(healthRatings.contains(1));
        assertTrue(healthRatings.contains(2));
    }

    @Test
    public void should_calc_protein_for_MenuItem() {
        List<Object> proteins = moonCake.accept(new CalculateProteinVisitor());
        assertEquals(2, proteins.size());
        assertTrue(proteins.contains("100.0 g"));
        assertTrue(proteins.contains("200.0 g"));
    }

    @Test
    public void should_calc_calory_for_MenuItem() {
        List<Object> calories = moonCake.acceptCaloryVisitor(new CaloryVisitor());
        assertEquals(3, calories.size());
        assertTrue(calories.contains("10 J"));
        assertTrue(calories.contains("20 J"));
        assertTrue(calories.contains("Cooking will double calories!!!"));
    }

    private static Ingredient CreateFlour() {
        NutritionInfo nutrition = new NutritionInfo(1, 10, 100d);
        return new Ingredient(nutrition);
    }

    private static Ingredient CreateYolk() {
        NutritionInfo nutrition = new NutritionInfo(2, 20, 200d);

        return new Ingredient(nutrition);
    }

    private static MenuItem CreateMoonCake() {
        List<Ingredient> ingredients = Arrays.asList(flour, yolk);
        MenuItem menuItem = new MenuItem(ingredients);
        return menuItem;
    }
}