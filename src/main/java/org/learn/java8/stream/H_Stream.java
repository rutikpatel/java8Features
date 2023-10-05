package org.learn.java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class H_Stream {

    public static void main(String[] args) {
        Integer[] arr = {10,44,23,5,23,32,56,54,32,12};

        Stream<Integer> numbers = Arrays.stream(arr);

//        numbers.forEach(num-> System.out.println(num));
        numbers.forEach(System.out::println);

    }
}
