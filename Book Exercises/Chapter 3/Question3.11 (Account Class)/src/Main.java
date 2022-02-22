import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account("Asad ALi", 50);
        Account account2 = new Account("Haroon", -75);
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("Adding %.2f to account1%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter Deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("Adding %.2f to account2%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter Withdraw amount for account1: ");
        double withDrawAmount = input.nextDouble();
        System.out.printf("Withdrawing %.2f from account1%n%n", withDrawAmount);
        account1.withdraw(withDrawAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter Withdraw amount for account1: ");
        withDrawAmount = input.nextDouble();
        System.out.printf("Withdrawing %.2f from account2%n%n", withDrawAmount);
        account2.withdraw(withDrawAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n%n", account2.getName(), account2.getBalance());
    }
    }

