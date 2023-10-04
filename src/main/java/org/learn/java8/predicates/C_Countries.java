package org.learn.java8.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class C_Countries {

    public static void main(String[] args) {

        List<Country> countries = new ArrayList<>();

        countries.add(new Country("India",174837584));
        countries.add(new Country("Iran",80857));
        countries.add(new Country("Hungary",837584));
        countries.add(new Country("Poland",17483));
        countries.add(new Country("Sweden",44837584));
        countries.add(new Country("Iceland",84837584));
        countries.add(new Country("Israel",4837584));

        Predicate<Country> p = (country)->
                (country.getName().startsWith("I")||(country.getName().startsWith("i")));

        for(Country c :countries){
            if(p.test(c)){
                System.out.println(c);
            }
        }

    }
}
