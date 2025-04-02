package com.showroom.app.customer;

public class Customer {
    public String name;
    public String city;

    public Customer(String customerName, String customerCity) {
        this.name = customerName;
        this.city = customerCity;
    }

    public void customerDetails() {
        System.out.println("\nCustomer Name: " + this.name);
        System.out.println("Customer City: " + this.city);
    }
}
