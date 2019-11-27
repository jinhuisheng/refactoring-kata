package me.aikin.refactoring.visitor.pattern;

/**
 * @author huisheng.jin
 * @version 2019/11/27.
 */
public class CalculateProteinVisitor implements Visitor {
    @Override
    public Object visit(Ingredient element) {
        return element.getProtein();
    }
}
