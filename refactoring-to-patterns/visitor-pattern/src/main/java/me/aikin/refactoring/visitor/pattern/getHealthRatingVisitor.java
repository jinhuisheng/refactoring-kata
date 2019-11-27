package me.aikin.refactoring.visitor.pattern;

/**
 * @author huisheng.jin
 * @version 2019/11/27.
 */
public class getHealthRatingVisitor implements Visitor {
    @Override
    public Object visit(Ingredient element) {
        return element.getHealthRating();
    }
}
