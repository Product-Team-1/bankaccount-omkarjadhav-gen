package com.example.project;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount: " + amount);
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: " + balance);
            return;
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}