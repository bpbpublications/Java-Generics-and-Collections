package com.meennu.javabook.chap2;

import java.util.Arrays;
import java.util.List;

abstract class Transaction {
    private double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract String getType(); // Different transaction types

    @Override
    public String toString() {
        return "Transaction{" +
               "amount=" + amount +
               ", type='" + getType() + '\'' +
               '}';
    }
}

class Deposit extends Transaction {
    public Deposit(double amount) {
        super(amount);
    }

    @Override
    public String getType() {
        return "Deposit";
    }
}

class Withdrawal extends Transaction {
    public Withdrawal(double amount) {
        super(amount);
    }

    @Override
    public String getType() {
        return "Withdrawal";
    }
}

public class TransactionProcessor {

    public static <T extends Transaction> void processTransactions(List<T> transactions) {
        for (T transaction : transactions) {
            System.out.println("Processing " + transaction);
            // Perform specific actions based on transaction type (e.g., update balances)
            if (transaction instanceof Deposit) {
                // ... handle deposit-specific logic
            } else if (transaction instanceof Withdrawal) {
                // ... handle withdrawal-specific logic
            }
        }
    }

    public static void main(String[] args) {
        List<Deposit> deposits = Arrays.asList(new Deposit(100), new Deposit(50));
        processTransactions(deposits); // Works: Deposit extends Transaction

        List<Withdrawal> withdrawals = Arrays.asList(new Withdrawal(20), new Withdrawal(75));
        processTransactions(withdrawals); // Works: Withdrawal extends Transaction

        List<Transaction> allTransactions = Arrays.asList(new Deposit(100), new Withdrawal(20));
        processTransactions(allTransactions); // Works: Transaction is a Transaction

        // List<String> strings = Arrays.asList("a", "b");
        // processTransactions(strings); // Compile-time error: String is not a Transaction
    }
}
