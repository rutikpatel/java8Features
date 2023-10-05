package org.learn.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Parallel stream - fork/join framework
public class A_EvenNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }

        List<Integer> result  =list.stream().filter(num->num%2==0)
                                           .collect(Collectors.toList());
        System.out.println(result);
    }

}
