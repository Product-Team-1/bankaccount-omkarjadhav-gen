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
        // TODO: implement withdraw with guard clauses (no overdraft, no negative/zero withdrawals)
    }

    public double getBalance() {
        return balance;
    }
}
