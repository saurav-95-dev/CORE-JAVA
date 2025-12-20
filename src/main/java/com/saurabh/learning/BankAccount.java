package com.saurabh.learning;

public class BankAccount {
    private int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    int getBalance() {
        return balance;
    }
}
