package org.learn.java8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class A_RandomNumber {

    public static void main(String[] args) {

        Supplier<String> s1 = ()-> "java";

        System.out.println(s1.get());

        Supplier<Integer> s2 = ()-> new Random().nextInt(1000);
        for(int i = 0;i<20;i++){
            System.out.println(s2.get());
        }
    }
}
