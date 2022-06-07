// Recourses
public class Account {
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
}

