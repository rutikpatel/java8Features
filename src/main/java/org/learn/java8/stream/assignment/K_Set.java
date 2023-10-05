package org.learn.java8.stream.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class K_Set {

    public static void main(String[] args) {
        List<HDFCBank> list = new ArrayList<>();
        list.add(new HDFCBank("Rutik",23749,3434));
        list.add(new HDFCBank("Krupa",43434,4343));
        list.add(new HDFCBank("Kaju",23434,1467));
        list.add(new HDFCBank("Pappa",87965,9864));
        list.add(new HDFCBank("Mummy",54633,6564));

        Set<HDFCBank> result = list.stream().filter((b)->b.getBalance()>3000).collect(Collectors.toSet());
        System.out.println(result);

    }
}
