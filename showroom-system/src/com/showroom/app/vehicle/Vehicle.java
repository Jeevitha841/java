package com.showroom.app.vehicle;

public class Vehicle {
    public String model;
    public double price;
    public String fuelType;

    public Vehicle(String vehicleModel, double vehiclePrice, String vehicleFuelType) {
        this.model = vehicleModel;
        this.price = vehiclePrice;
        this.fuelType = vehicleFuelType;
    }

    public void vehicleDetails() {
        System.out.println("\nVehicle Model: " + model);
        System.out.println("Vehicle Price: ₹" + price);
        System.out.println("Fuel Type: " + fuelType);
    }
}
