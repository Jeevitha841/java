package com.xworkx.banking.costumer;

public class Customer {
    public String name;
    public String city;
    public BankAccount[] bankAccounts;

    public Customer(String name, String city, BankAccount[] bankAccounts) {
        this.name = name;
        this.city = city;
        this.bankAccounts = bankAccounts;
    }

    public void customerDetails() {
        System.out.println("\nCustomer Name: " + this.name);
        System.out.println("Customer City: " + this.city);
        for (BankAccount account : bankAccounts) {
            account.bankAccountDetails();
        }
    }
}
