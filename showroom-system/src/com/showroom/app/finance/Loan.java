package com.showroom.app.finance;

public class Loan {
    public String type;
    public double interestRate;
    public int duration;

    public Loan(String loanType, double loanInterestRate, int loanDuration) {
        this.type = loanType;
        this.interestRate = loanInterestRate;
        this.duration = loanDuration;
    }

    public void loanDetails() {
        System.out.println("\nLoan Type: " + this.type);
        System.out.println("Interest Rate: " + this.interestRate + "%");
        System.out.println("Duration: " + this.duration + " Years");
    }
}
