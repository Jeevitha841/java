package com.xworkz.fitness.Membership;

public class Member {
    public String name;
    public int age;
    public String membershipType;

    public void memberDetails() {
        System.out.println("\nMember Details:");
        System.out.println("Member Name: " + this.name);
        System.out.println("Age: " + this.age + " Years");
        System.out.println("Membership Type: " + this.membershipType);
    }
}
