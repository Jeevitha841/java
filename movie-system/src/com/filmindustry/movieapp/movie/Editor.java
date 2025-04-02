package com.filmindustry.movieapp.movie;

public class Editor {
    public String name;
    public int age;
    public int experience;

    public Editor(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public void editorDetails() {
        System.out.println("\nEditor:");
        System.out.println("Editor Name: " + this.name);
        System.out.println("Editor Age: " + this.age + " Years");
        System.out.println("Editor Experience: " + this.experience + " Experience");
    }
}