package org.learn.java8.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class C_BankTest {

    public static void main(String[] args) {
        List<Bank> list = new ArrayList<>();

        list.add(new Bank("Rutik",76237834));
        list.add(new Bank("Chintan",82374834));
        list.add(new Bank("Saurav",346237834));
        list.add(new Bank("Nishad",62378347));


        Function<Bank,String > f = bank->bank.getName();

        for(Bank b : list) {
            if(f.apply(b) != null)
                System.out.println(b.getName());
        }

        System.out.println("Ascending order based on Name");
        Collections.sort(list, Comparator.comparing(f));
        System.out.println(list);

        System.out.println("Ascending order based on Account Number");
        Collections.sort(list, Comparator.comparing(bank -> bank.getAccNum()));
        System.out.println(list);

//      Method Reference
        System.out.println("Descending order based on Account Number");
        Collections.sort(list, Comparator.comparing(Bank::getAccNum).reversed());
        System.out.println(list);
    }
}
