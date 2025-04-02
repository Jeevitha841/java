package com.xworkx.banking.services;

public class CreditCard {
    public String type;
    public double limit;

    public CreditCard(String type, double limit) {
        this.type = type;
        this.limit = limit;
    }

    public void creditCardDetails() {
        System.out.println("\nCredit Card Details:");
        System.out.println("Card Type: " + this.type);
        System.out.println("Credit Limit: " + this.limit);

    }
}