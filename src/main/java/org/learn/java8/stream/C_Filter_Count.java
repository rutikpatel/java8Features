package org.learn.java8.stream;

import java.util.ArrayList;

public class C_Filter_Count {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("java");
        al.add("php");
        al.add("python");
        al.add("ruby");

        long count = al.stream().filter(str->str.length()==3).count();
        System.out.println(count);


    }
}
