package com.showroom.app.showroom;

public class Staff {
    public int id;
    public String name;
    public String address;

    public Staff(int staffId, String staffName, String staffAddress) {
        this.id = staffId;
        this.name = staffName;
        this.address = staffAddress;
    }

    public void staffDetails() {
        System.out.println("\nStaff ID: " + this.id);
        System.out.println("Staff Name: " + this.name);
        System.out.println("Staff Address: " + this.address);
    }
}
