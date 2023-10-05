package org.learn.java8.stream.assignment;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class M_Infinite_Number{

    public static void main(String[] args) {

//        Stream.iterate(1,num->num+2)
//                .forEach(System.out::println);

        Stream.iterate(1,num->num+1)
                .filter(i->i%2==0)
                .limit(20)
                .forEach(System.out::println);
    }
}
