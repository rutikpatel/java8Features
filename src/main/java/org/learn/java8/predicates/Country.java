package org.learn.java8.predicates;

public class Country {
    private String name;
    private int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }


    @Override
    public String toString() {
        return "country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    public String getName() {
        return name;
    }
}
