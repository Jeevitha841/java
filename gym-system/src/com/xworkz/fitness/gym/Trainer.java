package com.xworkz.fitness.gym;

public class Trainer {
    public String name;
    public int age;
    public int experience;
    public String specialization;

    public void trainerDetails() {
        System.out.println("\nTrainer Details:");
        System.out.println("Trainer Name: " + this.name);
        System.out.println("Age: " + this.age + " Years");
        System.out.println("Experience: " + this.experience + " Years");
        System.out.println("Specialization: " + this.specialization);
    }
}
