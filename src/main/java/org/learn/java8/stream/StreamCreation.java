package org.learn.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {
        String[] str={"unix","java","php"};
        Stream<String> stream = Arrays.stream(str);
        List<String> result = stream.sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
