package com.xworkx.banking.staff;

import com.xworkx.banking.costumer.Branch;

public class Teller extends Employee{
    public Teller(String name, int experience, Branch branch) {
        super(name, experience, branch);
    }

    public void tellerDetails() {
        System.out.println("\nTeller Details:");
        employeeDetails();
    }
}
