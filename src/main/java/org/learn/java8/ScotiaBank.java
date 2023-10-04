package org.learn.java8;

public class ScotiaBank implements IBank{
    @Override
    public void withdraw() {

    }

    @Override
    public void deposit() {

    }

    @Override
    public void loan() {
        IBank.super.loan();
    }
}
