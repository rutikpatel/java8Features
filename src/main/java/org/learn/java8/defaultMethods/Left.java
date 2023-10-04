package org.learn.java8.defaultMethods;

public interface Left {
    default void m1(){
        System.out.println("Left m1");
    }
}
