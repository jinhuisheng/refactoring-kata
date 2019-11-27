package me.aikin.refactoring.visitor.pattern;

import java.util.List;
import java.util.stream.Collectors;

public class MenuItem {
    private List<Ingredient> ingredients;

    public MenuItem(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * 访问者访问元素的入口
     *
     * @param visitor 访问者
     */
    public List<Object> accept(Visitor visitor) {
        return acceptInternal(visitor);
    }

    /**
     * 访问者访问元素的入口
     *
     * @param visitor 访问者
     */
    public List<Object> acceptCaloryVisitor(Visitor visitor) {
        List<Object> calories = acceptInternal(visitor);
        calories.add("Cooking will double calories!!!");
        return calories;
    }

    private List<Object> acceptInternal(Visitor visitor) {
        return ingredients.stream()
                .map(item -> item.accept(visitor))
                .collect(Collectors.toList());
    }


}
