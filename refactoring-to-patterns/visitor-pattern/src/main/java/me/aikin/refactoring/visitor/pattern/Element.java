package me.aikin.refactoring.visitor.pattern;

/**
 * @author huisheng.jin
 * @version 2019/11/27.
 */
public interface Element {
    //接受一个抽象访问者访问
    Object accept(Visitor visitor);
}
