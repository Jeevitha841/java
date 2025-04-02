package com.showroom.app;

import com.showroom.app.showroom.*;
import com.showroom.app.vehicle.*;
import com.showroom.app.customer.*;
import com.showroom.app.finance.*;

public class ShowroomRunner {
    public static void main(String[] args) {
        System.out.println("Showroom Management System Started\n");

        // Creating Staff Members
        Staff staff1 = new Staff(101, "Ramesh Kumar", "Bangalore");
        Staff staff2 = new Staff(102, "Suresh Verma", "Delhi");

        // Creating Managers
        Staff[] manager1Staff = {staff1, staff2};
        Manager manager1 = new Manager("Amit Singh", manager1Staff);

        // Creating Showroom
        Manager[] showroomManagers = {manager1};
        Showroom showroom = new Showroom("Luxury Auto Hub", showroomManagers);

        // Creating Vehicles
        Car car1 = new Car("Audi A4", 4500000, "Petrol");
        Bike bike1 = new Bike("Royal Enfield", 250000, "Petrol");

        // Displaying Vehicle Details
        car1.carDetails();
        bike1.bikeDetails();

        // Creating Customers
        Customer customer1 = new Customer("Rahul Sharma", "Mumbai");
        Customer customer2 = new Customer("Sneha Patil", "Pune");

        // Making Purchases
        Purchase purchase1 = new Purchase(customer1, car1);
        Purchase purchase2 = new Purchase(customer2, bike1);

        // Creating Finance Options
        Loan loan1 = new Loan("Car Loan", 7.5, 5);
        Insurance insurance1 = new Insurance("Comprehensive", "HDFC Ergo");

        // Display Details
        showroom.showroomDetails();
        purchase1.purchaseDetails();
        purchase2.purchaseDetails();
        loan1.loanDetails();
        insurance1.insuranceDetails();

        System.out.println("\nShowroom Management System Ended");
    }
}
