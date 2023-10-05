package org.learn.java8.stream.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class N_Filter_Map_Limit_Distinct {

    public static void main(String[] args) {
        List<HDFCBank> list = new ArrayList<>();
        list.add(new HDFCBank("Rutik",23749,34434));
        list.add(new HDFCBank("Krupa",43434,43433));
        list.add(new HDFCBank("Kaju",23434,1467));
        list.add(new HDFCBank("Pappa",87965,94864));
        list.add(new HDFCBank("Mummy",54633,6564));

        List<String>  result= list.stream().filter(bank->bank.getBalance()>10000)
                .map(HDFCBank::getCustomerName)
                .map(String::toUpperCase)
                .limit(2)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
