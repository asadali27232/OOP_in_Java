import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account("Asad Ali", 1000000);

        System.out.println(myAccount);
        System.out.println();
        myAccount.utilitiesCheck();

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
        //Printing Summary a single use of ATM
        System.out.println();
        System.out.println(myAccount);
        System.out.println("Total Deposits: " + myAccount.getTotalDeposits());
        System.out.println("Total Withdraws: " + myAccount.getTotalWithdraws());
        System.out.println("Transaction Balance: " + myAccount.computeTransactionBalance());
        System.out.println("Total amount Credited: " + myAccount.sumCreditTransactions());
    }
}

