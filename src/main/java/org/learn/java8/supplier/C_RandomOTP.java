package org.learn.java8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class C_RandomOTP {

    public static void main(String[] args) {
        Supplier<String> s1 = ()-> {
            String otp ="JE-";
            for(int i=0;i<6;i++)
            {
               otp += new Random().nextInt(10);
            }
            return otp;
        };

        System.out.println(s1.get());
    }
}
