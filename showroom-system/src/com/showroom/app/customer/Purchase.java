package com.showroom.app.customer;

import com.showroom.app.vehicle.Vehicle;

public class Purchase {
    public Customer customer;
    public Vehicle vehicle;

    public Purchase(Customer customer, Vehicle vehicle) {
        this.customer = customer;
        this.vehicle = vehicle;
    }

    public void purchaseDetails() {
        customer.customerDetails();
        System.out.println("Purchased Vehicle: " + vehicle.model);
        vehicle.vehicleDetails();
    }
}
