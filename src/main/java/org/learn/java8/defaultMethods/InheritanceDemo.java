package org.learn.java8.defaultMethods;

public class InheritanceDemo implements Right,Left{

    @Override
    public void m1() {
        Right.super.m1();
    }

    public static void main(String[] args) {
        InheritanceDemo i = new InheritanceDemo();
        i.m1();
    }
}
