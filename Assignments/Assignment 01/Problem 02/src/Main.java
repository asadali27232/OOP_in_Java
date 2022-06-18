import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i);
        }
        int userID;
        while (true) {
            do {
                System.out.print("Enter an ID (0-9): ");
                userID = input.nextInt();
            } while (userID < 0 || userID > 9);
    
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
                        accounts[userID].checkBalance();
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        amount = input.nextDouble();
                        accounts[userID].withdraw(amount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        amount = input.nextDouble();
                        accounts[userID].deposit(amount);
                        break;
                    case 4:
                        // Do nothing send control to the start of current loop
                    default:
                        System.out.println("Enter correct choice.");
                }
            }
        }
    }
}









