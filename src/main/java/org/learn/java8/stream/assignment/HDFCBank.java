package org.learn.java8.stream.assignment;

public class HDFCBank {

    String customerName;
    int accNumber;
    int balance;

    public HDFCBank(String customerName, int accNumber, int balance) {
        this.customerName = customerName;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "HDFCBank{" +
                "customerName='" + customerName + '\'' +
                ", accNumber=" + accNumber +
                ", balance=" + balance +
                '}';
    }
}
