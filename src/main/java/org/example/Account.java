package org.example;

public class Account {

    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds.");
        }
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }

    public void transfer(double amount, Account anotherAccount) throws InsufficientFundsException {
        if (anotherAccount == null) {
            throw new IllegalArgumentException("Target account cannot be null.");
        }
        this.withdraw(amount);
        anotherAccount.deposit(amount);
    }
}

