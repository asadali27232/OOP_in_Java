package com.company;
// dev: SP21-BCS-007
public class Account {
    private String accountTitle;
    private double balance;
    private static int transactionCountLimit;
    private int transactionCounter;
    private double[] transactionAmount;
    // Constructors

    public Account(String accountTitle, double balance) {
        setAccountTitle(accountTitle);
        setBalance(balance);
        this.transactionCounter = 0;
        transactionCountLimit = 100;
        transactionAmount = new double[transactionCountLimit];
    }

    // Getter
    public String getAccountTitle() {
        return accountTitle;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactionCounter() {
        return transactionCounter;
    }

    // Setter
    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactionCounter(int transactionCounter) {
        this.transactionCounter = transactionCounter;
    }

    public void setTransactionAmount(double amount) {
        transactionAmount[transactionCounter] = amount;
        transactionCounter++;
    }

    public String toString() {
        // Mr. Ali has 5000 Rs. (Transactions count: 3)
        String string = "Mr/Mrs " + accountTitle + " has " + balance + "$ (Transaction Count: " + transactionCounter + ")";
        return string;
    }

    // Print Balance
    public void checkBalance() {
        System.out.println("Your Current Balance is: " + getBalance() + "$");
    }

    // Deposit
    public void deposit(double amount) {
        if (transactionCounter < transactionAmount.length) {
            if (amount > 0)
                setBalance(getBalance() + amount);
            setTransactionAmount(amount);
        } else {
            System.out.println("Your transaction limit has been reached");
        }
    }

    // Withdraw balance
    public void withdraw(double amount) {
        if (transactionCounter < transactionAmount.length) {

            if (amount < 0)
                System.out.println("Please Enter correct withdraw amount!");
            if (amount > getBalance())
                System.out.println("You do not have sufficient balance to complete this transaction.");
            else {
                setBalance(getBalance() - amount);
                setTransactionAmount(-amount);
            }
        } else {
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
        for (int i = 0; i < transactionCounter; i++) {
            if (transactionAmount[i] > 0) {
                System.out.println(transactionAmount[i]);
            }
        }
    }
}
