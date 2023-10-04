package org.learn.java8.function;

public class Bank {

    String name;
    int accNum;

    public Bank(String name, int accNum) {
        this.name = name;
        this.accNum = accNum;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accNum=" + accNum +
                '}';
    }
}
