package com.showroom.app.finance;

public class Insurance {
    public String type;
    public String provider;

    public Insurance(String insuranceType, String insuranceProvider) {
        this.type = insuranceType;
        this.provider = insuranceProvider;
    }

    public void insuranceDetails() {
        System.out.println("\nInsurance Type: " + this.type);
        System.out.println("Provider: " + this.provider);
    }
}
