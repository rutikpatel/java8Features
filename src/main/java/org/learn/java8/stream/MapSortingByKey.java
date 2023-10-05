package org.learn.java8.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortingByKey {

    public static void main(String[] args) {
        Map<String,Integer> ItemToPrice = new HashMap<>();

        ItemToPrice.put("Sony Bravia",1000);
        ItemToPrice.put("Apple Iphone 6",1200);
        ItemToPrice.put("HP laptop",700);
        ItemToPrice.put("Acer Hd Monitor",130);
        ItemToPrice.put("Samsung Galaxy",800);

        ItemToPrice.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(System.out::println);

        ItemToPrice.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
