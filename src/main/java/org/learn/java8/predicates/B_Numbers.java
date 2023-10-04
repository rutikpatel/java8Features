package org.learn.java8.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class B_Numbers {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(36);
        list.add(52);
        list.add(55);

        Predicate<Integer> p =(n)->n>10;

        for(Integer i :list){
            if(p.test(i))
                System.out.println(i);
        }

//        List<Integer> l= list.stream().filter((n)->n>10).collect(Collectors.toList());
//        System.out.println(l);
    }
}
