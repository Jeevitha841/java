package com.xworkx.banking.transactions;

import com.xworkx.banking.costumer.BankAccount;

public class Transaction {
    public double amount;
    public String type;
    public BankAccount account;

    public Transaction(double amount, String type, BankAccount account) {
        this.amount = amount;
        this.type = type;
        this.account = account;
    }

    public void transactionDetails() {
        System.out.println("\nTransaction Type: " + this.type);
        System.out.println("Transaction Amount: " + this.amount);
        System.out.println("Account ID: " + this.account.id);
    }
}
