package com.xworkx.banking.staff;

import com.xworkx.banking.costumer.Branch;

public class Employee {
    public String name;
    public int experience;
    public Branch branch;

    public Employee(String name, int experience, Branch branch) {
        this.name = name;
        this.experience = experience;
        this.branch = branch;
    }

    public void employeeDetails() {
        System.out.println("\nEmployee Name: " + this.name);
        System.out.println("Employee Experience: " + this.experience + " years");
        System.out.println("Branch: " + this.branch.bankName + " - " + this.branch.location);
    }
}
