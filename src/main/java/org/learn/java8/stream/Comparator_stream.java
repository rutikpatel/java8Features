package org.learn.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//for big amount of data we use parallel stream
public class Comparator_stream {
    public static void main(String[] args) {
        List<Employee> eList = new ArrayList<>();
        eList.add(new Employee("A",1972L));
        eList.add(new Employee("B",97452L));
        eList.add(new Employee("C",3572L));
        eList.add(new Employee("D",974972L));
        eList.add(new Employee("E",254572L));

        System.out.println("Ascending Order");
        List<Employee> list=eList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("Descending Order");
        List<Employee> list1=eList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(list1);

        long count = eList.parallelStream().filter((e)->e.getSalary()>134000L).count();
        System.out.println(count);
    }
}
