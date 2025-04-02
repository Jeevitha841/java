package com.filmindustry.movieapp.movie;

public class Producer {
    public String name;
    public int age;
    public String productionHouse;

    public Producer(String name, int age, String productionHouse) {
        this.name = name;
        this.age = age;
        this.productionHouse = productionHouse;
    }

    public void producerDetails() {
        System.out.println("\nProducer:");
        System.out.println("Producer Name: " + this.name);
        System.out.println("Producer Age: " + this.age + " Years");
        System.out.println("Producer Production House: " + this.productionHouse);
    }
}
