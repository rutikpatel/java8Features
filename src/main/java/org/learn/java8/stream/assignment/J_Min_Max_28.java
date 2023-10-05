package org.learn.java8.stream.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class J_Min_Max_28 {

    public static void main(String[] args) {
        List<HDFCBank> list = new ArrayList<>();
        list.add(new HDFCBank("Rutik",23749,3434));
        list.add(new HDFCBank("Krupa",43434,4343));
        list.add(new HDFCBank("Kaju",23434,1467));
        list.add(new HDFCBank("Pappa",87965,9864));
        list.add(new HDFCBank("Mummy",54633,6564));

        System.out.println("Max: ");
        HDFCBank result = list.stream().max(Comparator.comparing(HDFCBank::getBalance)).get();
        System.out.println(result);

        System.out.println("Min: ");
        HDFCBank result1 = list.stream().min(Comparator.comparing(HDFCBank::getBalance)).get();
        System.out.println(result1);
    }
}
