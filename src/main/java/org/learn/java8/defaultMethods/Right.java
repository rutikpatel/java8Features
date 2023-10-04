package org.learn.java8.defaultMethods;

public interface Right {
    default void m1(){
        System.out.println("Right m1");
    }
}
