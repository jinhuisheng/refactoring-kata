package me.aikin.refactoring.visitor.pattern;

/**
 * @author huisheng.jin
 * @version 2019/11/27.
 */
public class CaloryVisitor implements Visitor {
    @Override
    public Object visit(Ingredient element) {
        return element.getCalory();
    }
}
