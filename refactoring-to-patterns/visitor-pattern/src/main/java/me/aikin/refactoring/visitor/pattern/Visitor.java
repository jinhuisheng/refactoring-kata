package me.aikin.refactoring.visitor.pattern;

/**
 * @author huisheng.jin
 * @version 2019/11/27.
 */
public interface Visitor {
    Object visit(Ingredient element);
}