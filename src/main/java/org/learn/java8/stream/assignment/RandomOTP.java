package org.learn.java8.stream.assignment;

import java.util.Random;
import java.util.stream.Stream;

public class RandomOTP {

    public static void main(String[] args) {

        Stream.generate(()->new Random().nextInt(1000000))
                .limit(6).forEach(System.out::println);
    }
}
