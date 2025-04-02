package com.showroom.app.vehicle;

public class Car extends Vehicle {
    public Car(String carModel, double carPrice, String carFuelType) {
        super(carModel, carPrice, carFuelType);
    }

    public void carDetails() {
        System.out.println("\nCar Details:");
        vehicleDetails();
    }
}
