package com.xworkz.fitness.gym;

public class Workout {
    public String planName;
    public String duration;
    public String difficulty;

    public void workoutPlanDetails() {
        System.out.println("\nWorkout Plan Details:");
        System.out.println("Plan Name: " + this.planName);
        System.out.println("Duration: " + this.duration);
        System.out.println("Difficulty Level: " + this.difficulty);
    }
}
