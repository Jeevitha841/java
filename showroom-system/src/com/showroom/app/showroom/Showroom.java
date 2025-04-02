package com.showroom.app.showroom;

public class Showroom {
    public String name;
    public Manager[] managers;

    public Showroom(String showroomName, Manager[] showroomManagers) {
        this.name = showroomName;
        this.managers = showroomManagers;
    }

    public void showroomDetails() {
        System.out.println("\nShowroom Details:");
        System.out.println("Showroom Name: " + this.name);
        for (Manager manager : managers) {
            manager.managerDetails();
        }
    }
}
