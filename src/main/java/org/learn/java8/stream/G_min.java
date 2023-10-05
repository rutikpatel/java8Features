package org.learn.java8.stream;

import java.util.ArrayList;

public class G_min {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(8);
        al.add(3);
        al.add(1);

        Integer result= al.stream().min((s1,s2)->s1.compareTo(s2)).get();
        System.out.println(result);
    }
}
