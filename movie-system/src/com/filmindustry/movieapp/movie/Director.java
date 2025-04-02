package com.filmindustry.movieapp.movie;

public class Director {
    public String name;
    public int age;
    public int experience;

    public Director(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public void directorDetails() {
        System.out.println("\nDirector:");
        System.out.println("Director Name: " + this.name);
        System.out.println("Director Age: " + this.age + " Years");
        System.out.println("Director Experience: " + this.experience + " Experience");
    }
}
