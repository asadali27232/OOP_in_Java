package com.company;
// dev: SP21-BCS-007
import java.util.ArrayList;

public class Account {
    private String accountTitle;
    private double balance;
    private static int transactionCountLimit;
    private ArrayList<Double> transactionAmount;
    // Constructors

    public Account(String accountTitle, double balance) {
        setAccountTitle(accountTitle);
        setBalance(balance);
        transactionAmount = new ArrayList(100);
    }

    // Getter
    public String getAccountTitle() {
        return accountTitle;
    }

    public double getBalance() {
        return balance;
    }

    // Setter
    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactionAmount(double amount) {
        transactionAmount.add(amount);
    }

    public String toString() {
        // Mr. Ali has 5000 Rs. (Transactions count: 3)
        String string = "Mr/Mrs " + accountTitle + " has " + balance + "$ (Transaction Count: " + transactionAmount.size() + ")";
        return string;
    }

    // Print Balance
    public void checkBalance() {
        System.out.println("Your Current Balance is: " + getBalance() + "$");
    }

    // Deposit
    public void deposit(double amount) {
        if (transactionAmount.size() <= transactionCountLimit) {
            if (amount > 0) {
                setBalance(getBalance() + amount);
                setTransactionAmount(amount);
            }
        }
        else {
            System.out.println("Your transaction limit has been reached");
        }

    }

    // Withdraw balance
    public void withdraw(double amount) {
        if (transactionAmount.size() <= transactionCountLimit) {
            if (amount < 0)
                System.out.println("Please Enter correct withdraw amount!");
            if (amount > getBalance())
                System.out.println("You do not have sufficient balance to complete this transaction.");
            else {
                setBalance(getBalance() - amount);
                setTransactionAmount(-amount);
            }
        }
        else {
            System.out.println("Your transaction limit has been reached");
        }
    }

    public double computeTransactionBalance() {
        double transactionBalance = 0.0;
        for (double transactionAmount : transactionAmount) {
            transactionBalance += transactionAmount;
        }
        return transactionBalance;
    }

    public void printCreditTransactions() {
        for (int i = 0; i < transactionAmount.size(); i++) {
            if (transactionAmount.get(i) > 0) {
                System.out.println(transactionAmount.get(i));
            }
        }
    }
}
