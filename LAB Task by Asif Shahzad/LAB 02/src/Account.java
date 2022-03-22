// dev: SP21-BCS-007

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private String accountTitle;
    private double balance;
    private boolean SMSAlert;
    private boolean creditCard;
    private int totalDeposits;
    private int totalWithdraws;
    private static int transactionCountLimit;
    private ArrayList<Double> transactionAmount;

    {
        SMSAlert = false;
        creditCard = false;
    }

    // Constructors
    public Account(String accountTitle, double balance) {
        setAccountTitle(accountTitle);
        setBalance(balance);
        setTotalDeposits(0);
        setTotalWithdraws(0);
        setTransactionCountLimit(100);
        transactionAmount = new ArrayList(100);
    }

    public void utilitiesCheck() {
        Scanner input = new Scanner(System.in);

        System.out.print("Do you want to opt SMS Alert Service (Y/N): ");
        String choice = input.nextLine();
        if (choice.equals("Y") || choice.equals("y")) {
            this.SMSAlert = true;
        }

        System.out.print("Do you want to opt Credit Card Service (Y/N): ");
        choice = input.nextLine();
        if (choice.equals("Y") || choice.equals("y")) {
            this.creditCard = true;
        }
        deductCharges();
    }

    // Getter
    public String getAccountTitle() {
        return accountTitle;
    }

    public double getBalance() {
        return balance;
    }

    public int getTotalDeposits() {
        return totalDeposits;
    }

    public int getTotalWithdraws() {
        return totalWithdraws;
    }

    public static int getTransactionCountLimit() {
        return transactionCountLimit;
    }

    public boolean isSMSAlert() {
        return SMSAlert;
    }

    public boolean isCreditCard() {
        return creditCard;
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

    public void setTotalDeposits(int totalDeposits) {
        this.totalDeposits = totalDeposits;
    }

    public void setTotalWithdraws(int totalWithdraws) {
        this.totalWithdraws = totalWithdraws;
    }

    public String toString() {
        // Mr. Ali has 5000 Rs. (Transactions count: 3)
        String string = "Mr/Mrs " + accountTitle + " has " + balance + "$ (Transaction Count: " + transactionAmount.size() + ")";
        return string;
    }

    public static void setTransactionCountLimit(int transactionCountLimit) {
        Account.transactionCountLimit = transactionCountLimit;
    }

    // Print Balance
    public void checkBalance() {
        System.out.println("Your Current Balance is: " + getBalance() + "$");
    }

    // Deposit
    public void deposit(double amount) {
        if (transactionAmount.size() <= transactionCountLimit) {
            if (amount > 0) {
                if (getBalance() > 100000) {
                    amount = amount + (amount * 0.01);
                    setBalance(getBalance() + amount);
                    setTransactionAmount(amount);
                    setTotalDeposits(getTotalDeposits() + 1);
                } else {
                    setBalance(getBalance() + amount);
                    setTransactionAmount(amount);
                    setTotalDeposits(getTotalDeposits() + 1);
                }
            }
        } else {
            System.out.println("Your transaction limit has been reached");
        }

    }

    // Withdraw balance
    public void withdraw(double amount) {
        if (transactionAmount.size() <= transactionCountLimit) {
            if (amount < 0)
                System.out.println("Please Enter correct withdraw amount!");
            else if (amount > getBalance())
                System.out.println("You do not have sufficient balance to complete this transaction.");
            else if (getBalance() - amount < 50000) {
                System.out.println("Are you sure you want to withdraw it will make your balance below 50000$");
                System.out.print("Enter 1 to continue and 0 to decline: ");
                Scanner input = new Scanner(System.in);
                int choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("Balance before transaction: " + getBalance());
                    amount = amount + (amount * 0.02);
                    setBalance(getBalance() - amount);
                    setTransactionAmount(-amount);
                    setTotalWithdraws(getTotalWithdraws() + 1);
                    System.out.println("Balance after transaction: " + getBalance());
                } else {
                    return;
                }
            } else {
                setBalance(getBalance() - amount);
                setTransactionAmount(-amount);
                setTotalWithdraws(getTotalWithdraws() + 1);
            }
        } else {
            System.out.println("Your transaction limit has been reached");
        }
    }

    public double computeTransactionBalance() {
        double transactionBalance = 0.0;
        System.out.println("Transactions History:");
        for (double transactionAmount : transactionAmount) {
            if (transactionAmount >= 0)
                System.out.println("Deposit: " + transactionAmount);
            else
                System.out.println("Withdraw: " + (-transactionAmount));
            transactionBalance += transactionAmount;
        }
        return transactionBalance;
    }

    public double sumCreditTransactions() {
        double sum = 0;
        for (int i = 0; i < transactionAmount.size(); i++) {
            if (transactionAmount.get(i) > 0) {
                sum += transactionAmount.get(i);
            }
        }
        return sum;
    }

    public void deductCharges() {
        if (getBalance() < 100000) {
            if (isSMSAlert()) {
                setBalance(getBalance() - 2000);
                System.out.println("SMS Alert Fee Deducted.");
            }
            if (isCreditCard()) {
                setBalance(getBalance() - 5000);
                System.out.println("Credit Card charges Deducted.");
            }
        }
    }
}
