package org.learn.java8.stream;

import java.util.ArrayList;

public class J_allMatch {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("java");
        al.add("php");
        al.add("python");
        al.add("ruby");

        boolean result =  al.stream().allMatch(str->str.contains("java"));
        System.out.println(result);

        boolean result1 =  al.stream().anyMatch(str->str.contains("java"));
        System.out.println(result1);

        boolean result2 =  al.stream().noneMatch(str->str.contains("java"));
        System.out.println(result1);
    }

}
