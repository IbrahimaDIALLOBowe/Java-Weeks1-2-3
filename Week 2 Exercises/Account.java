package com.Week2.Day7.Assignment2;

/**
 * Program to prevent creation of second object
 */

public class Account {
    // instance variables
    private String name;
    private int accountNum;
    private double balance;

    // account constructor
    Account(String initName, int initId, double initiBalance) {
        name = initName;
        accountNum = initId;
        balance = initiBalance;
    }

    public double getBalance() {
        return balance;
    }
}
