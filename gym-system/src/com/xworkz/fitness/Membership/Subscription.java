package com.xworkz.fitness.Membership;

public class Subscription {
    public String memberName;
    public String planType;
    public double amount;

    public void subscriptionDetails() {
        System.out.println("\nSubscription Details:");
        System.out.println("Member Name: " + this.memberName);
        System.out.println("Plan Type: " + this.planType);
        System.out.println("Amount Paid: ₹" + this.amount);
    }
}
