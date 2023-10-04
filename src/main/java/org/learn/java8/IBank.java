package org.learn.java8;

public interface IBank {

    void withdraw();
    void deposit();

    default void loan() {
        System.out.println("");
    }
}
