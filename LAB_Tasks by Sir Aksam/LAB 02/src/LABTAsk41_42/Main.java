// dev: SP21-BCS-007

package LABTAsk41_42;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // One argument constructor
        Account myAccount = new Account("Asad");
        
        // Testing account class' methods
	System.out.println();
        System.out.println("Account Title: " + myAccount.getAccountTitle());
	System.out.println();
        myAccount.printBalance();
	System.out.println();
        
        Scanner input = new Scanner(System.in);
        
        // Getting amount to deposit
        System.out.print("Enter Amount to deposit: ");
        double amount = input.nextDouble();
        
        // Deposting amount
        myAccount.deposit(amount);
        System.out.println("Depositing " + amount + "$");
        System.out.println();
        myAccount.printBalance();
        System.out.println();
        
        // Getting amount to withdraw
        System.out.print("Enter Amount to withdraw: ");
        amount = input.nextDouble();
	
	// Withdrawing amount
        myAccount.withdrawBalance(amount);
        System.out.println("Withdrawing " + amount + "$");
        System.out.println();
        myAccount.printBalance();
        System.out.println();
        
        
    }
}
