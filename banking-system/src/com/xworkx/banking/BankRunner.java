package com.xworkx.banking;

import com.xworkx.banking.costumer.BankAccount;
import com.xworkx.banking.costumer.Branch;
import com.xworkx.banking.costumer.Customer;
import com.xworkx.banking.services.CreditCard;
import com.xworkx.banking.services.Loan;
import com.xworkx.banking.staff.Manager;
import com.xworkx.banking.staff.Teller;
import com.xworkx.banking.transactions.Transaction;
import com.xworkx.banking.transactions.TransactionHistory;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("Banking System Started\n");

        // Creating Branches
        Branch branch1 = new Branch("HDFC", "Mumbai");
        Branch branch2 = new Branch("HDFC", "Delhi");
        Branch[] branches1 = {branch1, branch2};

        Branch branch3 = new Branch("SBI", "Pune");
        Branch branch4 = new Branch("SBI", "Bangalore");
        Branch[] branches2 = {branch3, branch4};

        // Creating Bank Accounts
        BankAccount account1 = new BankAccount(1001, branches1);
        BankAccount account2 = new BankAccount(2001, branches2);

        // Creating Customer
        BankAccount[] customer1Accounts = {account1, account2};
        Customer customer1 = new Customer("Rahul Sharma", "Mumbai", customer1Accounts);
        customer1.customerDetails();

        // Transactions
        Transaction transaction1 = new Transaction(5000, "Deposit", account1);
        Transaction transaction2 = new Transaction(2000, "Withdrawal", account2);

        TransactionHistory history = new TransactionHistory();
        history.addTransaction(transaction1);
        history.addTransaction(transaction2);
        history.showTransactionHistory();

        // Bank Staff
        Manager manager = new Manager("Anil Kumar", 15, branch1);
        Teller teller = new Teller("Suresh Verma", 5, branch2);

        manager.managerDetails();
        teller.tellerDetails();

        // Bank Services
        Loan loan = new Loan(500000, 8.5, 5);
        loan.loanDetails();

        CreditCard creditCard = new CreditCard("Platinum", 200000);
        creditCard.creditCardDetails();

        System.out.println("\nBanking System Ended");
    }
}
