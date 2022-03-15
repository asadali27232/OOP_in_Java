package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount =  new Account("Asad Ali", 1000);

            int choice = 0;
            while (choice != 4) {
                System.out.println("Main Menu");
                System.out.println("1: Check Balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                System.out.print("Enter a choice: ");
                choice = input.nextInt();

                double amount = 0;
                switch (choice) {
                    case 1:
                        myAccount.checkBalance();
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        amount = input.nextDouble();
                        myAccount.withdraw(amount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        amount = input.nextDouble();
                        myAccount.deposit(amount);
                        break;
                    case 4:
                        // Do nothing send control to the start of current loop default
                        break;
                        default:
                        System.out.println("Enter correct choice.");
                }
            }
            System.out.println();
            System.out.println("Transaction Balance");
            System.out.println(myAccount.computeTransactionBalance());
            System.out.println("Credit Transactions");
            myAccount.printCreditTransactions();
        }
    }

