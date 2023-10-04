package org.learn.java8.consumer;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer,String> m = new HashMap<>();

        m.put(1,"java");
        m.put(2,"php");
        m.put(3,"python");
        m.put(4,"ruby");

        m.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
