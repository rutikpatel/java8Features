package org.learn.java8.predicates;

import java.util.function.Predicate;

public class A {

    public static void main(String[] args) {

        Predicate<Integer> p1 = (num)-> num==2020;

        System.out.println(p1.test(2020));

        Predicate<String> p2 = (s) -> s.length()>5;

        System.out.println(p2.test("java"));
    }
}
