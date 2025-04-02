package com.filmindustry.movieapp.movie;

public class Actor {
    public String name;
    public int age;
    public String roleName;

    public Actor(String name, int age, String roleName) {
        this.name = name;
        this.age = age;
        this.roleName = roleName;
    }

    public void actorsDetails() {
        System.out.println("\nActors Name: ");
        System.out.println("Actor Name: " + this.name);
        System.out.println("Actor Age: " + this.age + " Years");
        System.out.println("Actor Role Name in the Movie: " + this.roleName);
    }
}