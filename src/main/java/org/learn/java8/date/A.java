package org.learn.java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;


public class A {

    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println( t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        int dd = d.getDayOfMonth();
        int mm = d.getMonthValue();
        int yy = d.getYear();

        System.out.println(yy +"-"+mm+"-"+dd);

        LocalDate firstDay_2023 = LocalDate.ofYearDay(2023,1);
        System.out.println(firstDay_2023);

        LocalDate hundredDay_2001 = LocalDate.ofYearDay(2001,127);
        System.out.println(hundredDay_2001);

        Period p =Period.between(hundredDay_2001,d);
        System.out.println(p.getYears()+"Years "+p.getMonths()+"Months "+p.getDays()+"Days ");

    }
}
