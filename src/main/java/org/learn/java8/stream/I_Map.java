package org.learn.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class I_Map {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(9);
        al.add(76);
        al.add(0);
        al.add(43);
        al.add(54);
        al.add(65);
        al.add(21);

        List<Integer> list = al.stream().map(str->str+10).collect(Collectors.toList());
        System.out.println(list);

        List<Integer> list1 = al.stream()
                                .filter(num->num>30)
                                .map(str->str+10)
                                .collect(Collectors.toList());
        System.out.println(list1);

    }
}
