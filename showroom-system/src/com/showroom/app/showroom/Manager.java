package com.showroom.app.showroom;

public class Manager {
    public String name;
    public Staff[] staff;

    public Manager(String managerName, Staff[] managerStaff) {
        this.name = managerName;
        this.staff = managerStaff;
    }

    public void managerDetails() {
        System.out.println("\nManager Name: " + this.name);
        System.out.println("Staff Members:");
        for (Staff member : staff) {
            member.staffDetails();
        }
    }
}
