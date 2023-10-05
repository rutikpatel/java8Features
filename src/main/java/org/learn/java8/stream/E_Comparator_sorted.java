package org.learn.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E_Comparator_sorted {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("java");
        al.add("php");
        al.add("python");
        al.add("ruby");

        List<String> result = al.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println("Ascending Order:");
        System.out.println(result);

        List<String> result1 = al.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("Ascending Order:");
        System.out.println(result1);

    }
}
