package com.xworkz.fitness;

import com.xworkz.fitness.Membership.Member;
import com.xworkz.fitness.Membership.Subscription;
import com.xworkz.fitness.equipment.Equipment;
import com.xworkz.fitness.gym.GymAddress;
import com.xworkz.fitness.gym.Trainer;
import com.xworkz.fitness.gym.Workout;

public class fitnessRunner {
    public static void main(String[] args) {
        System.out.println("Gym Management System Started\n");

        // Gym Details
        GymAddress gym = new GymAddress();
        gym.name = "Gold's Gym";
        gym.location = "Delhi";
        gym.owner = "Rajesh Malhotra";
        gym.gymDetails();

        // Trainer Details
        Trainer trainer = new Trainer();
        trainer.name = "Amit Sharma";
        trainer.age = 35;
        trainer.experience = 10;
        trainer.specialization = "Weight Training";
        trainer.trainerDetails();

        // Workout Plan Details
        Workout workoutPlan = new Workout();
        workoutPlan.planName = "Muscle Gain Program";
        workoutPlan.duration = "12 Weeks";
        workoutPlan.difficulty = "Advanced";
        workoutPlan.workoutPlanDetails();

        // Member Details
        Member member = new Member();
        member.name = "Rohit Verma";
        member.age = 28;
        member.membershipType = "Premium";
        member.memberDetails();

        // Subscription Details
        Subscription subscription = new Subscription();
        subscription.memberName = "Rohit Verma";
        subscription.planType = "Yearly";
        subscription.amount = 15000;
        subscription.subscriptionDetails();

        // Equipment Details
        Equipment equipment = new Equipment();
        equipment.name = "Treadmill";
        equipment.brand = "Life Fitness";
        equipment.equipmentDetails();

        System.out.println("\nGym Management System Ended");
    }
}
