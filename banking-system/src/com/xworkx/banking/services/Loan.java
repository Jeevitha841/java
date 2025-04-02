package com.xworkx.banking.services;

public class Loan {
    public double amount;
    public double interestRate;
    public int duration; // in years

    public Loan(double amount, double interestRate, int duration) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public void loanDetails() {
        System.out.println("\nLoan Details:");
        System.out.println("Loan Amount: " + this.amount);
        System.out.println("Interest Rate: " + this.interestRate + "%");
        System.out.println("Loan Duration: " + this.duration + " years");

    }
}