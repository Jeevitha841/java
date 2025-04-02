package com.xworkx.banking.staff;

import com.xworkx.banking.costumer.Branch;

public class Manager extends Employee{
    public Manager(String name, int experience, Branch branch) {
        super(name, experience, branch);
    }

    public void managerDetails() {
        System.out.println("\nManager Details:");
        employeeDetails();
    }
}
