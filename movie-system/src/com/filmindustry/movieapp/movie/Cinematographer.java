package com.filmindustry.movieapp.movie;

public class Cinematographer {
    public String name;
    public int age;
    public int experience;

    public Cinematographer(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public void cinematographerDetails() {
        System.out.println("\nCinematographer:");
        System.out.println("Cinematographer Name: " + this.name);
        System.out.println("Cinematographer Age: " + this.age + " Years");
        System.out.println("Cinematographer Experience: " + this.experience + " Experience");
    }
}
