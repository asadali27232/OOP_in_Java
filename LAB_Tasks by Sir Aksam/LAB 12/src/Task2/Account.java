package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Recourses
public class Account implements Comparable<Account> {
    private String accountTitle;
    private double balance;


    public Account(String accountTitle) {
        this.accountTitle = accountTitle;
        this.balance = 500;
    }

    public Account(String accountTitle, double balance) {
        this.accountTitle = accountTitle;
        this.balance = balance;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public double getBalance() {
        return balance;
    }


    public void printBalance() {
        System.out.println("Your Current Balance is: " + balance + "$");
    }


    public void deposit(double amount) {
        if (amount > 0)
            this.balance = this.balance + amount;
    }


    public void withdrawBalance(double amount) {
        this.balance = this.balance - amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountTitle='" + accountTitle + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Account o) {
        return Double.compare(this.getBalance(), o.getBalance());
    }
}
class titleCompare implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return o1.getAccountTitle().compareTo(o2.getAccountTitle());
    }

    public static <T> void displayArrayList (ArrayList<T> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Account ac1 = new Account("Asad Ali", 5000);
        Account ac2 = new Account("Junaid Ali", 8000);
        Account ac3 = new Account("Nadir Ali", 3000);
        Account ac4 = new Account("Zubair Ali", 12000);
        Account ac5 = new Account("Ahmad Ali", 1000);

        ArrayList<Account> accounts = new ArrayList<Account>(5);
        accounts.add(ac1);
        accounts.add(ac2);
        accounts.add(ac3);
        accounts.add(ac4);
        accounts.add(ac5);

        displayArrayList(accounts);

        Collections.sort(accounts);

        displayArrayList(accounts);

        Collections.sort(accounts, new titleCompare());

        displayArrayList(accounts);

    }
}

