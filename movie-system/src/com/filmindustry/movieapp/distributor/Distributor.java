package com.filmindustry.movieapp.distributor;

public class Distributor {
    public String name;
    public String region;
    public String company;

    public Distributor(String name, String region, String company) {
        this.name = name;
        this.region = region;
        this.company = company;
    }

    public void distributorDetails() {
        System.out.println("\nDistributor Name: " + this.name);
        System.out.println("Distributor Region: " + this.region);
        System.out.println("Distributor Company: " + this.company);
    }
}
