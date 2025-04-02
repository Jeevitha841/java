package com.xworkx.banking.costumer;

public class Branch {
    public String bankName;
    public String location;

    public Branch(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
    }

    public void branchDetails() {
        System.out.println("Bank Name: " + this.bankName + ", Location: " + this.location);
    }
}
