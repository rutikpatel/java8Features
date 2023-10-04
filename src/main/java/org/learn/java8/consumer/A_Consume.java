package org.learn.java8.consumer;

import java.util.function.Consumer;

public class A_Consume {

    public static void main(String[] args) {

        Consumer<String> c = (s)-> System.out.println(s);

        c.accept("Rutik");
    }
}

