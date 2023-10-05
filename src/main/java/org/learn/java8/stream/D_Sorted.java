package org.learn.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D_Sorted {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("java");
        al.add("php");
        al.add("python");
        al.add("ruby");

        List<String> result = al.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
