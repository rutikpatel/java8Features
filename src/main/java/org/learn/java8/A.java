package org.learn.java8;


interface  B{

    static final String DB_USERNAME="root";
    void m1();
}


public class A implements B{

    public static void main(String[] args) {

        B obj = new A();
        obj.m1();
    }

    @Override
    public void m1() {
        System.out.println("m1 method impl");
    }
}
