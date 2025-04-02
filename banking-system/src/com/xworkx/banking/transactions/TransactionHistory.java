package com.xworkx.banking.transactions;

import java.util.ArrayList;
import java.util.List;
public class TransactionHistory {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void showTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (Transaction transaction : transactions) {
            transaction.transactionDetails();
        }
    }
}
