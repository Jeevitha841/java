package com.showroom.app.vehicle;

public class Bike extends Vehicle {
    public Bike(String bikeModel, double bikePrice, String bikeFuelType) {
        super(bikeModel, bikePrice, bikeFuelType);
    }

    public void bikeDetails() {
        System.out.println("\nBike Details:");
        vehicleDetails();
    }
}
