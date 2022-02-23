// dev: SP21-BCS-007
public class Main {

    public static void main(String[] args) {
        
        // One argument constructor
        Account myAccount = new Account("Asad");
        System.out.println("**********myAccount**********");
        
        // Testing account class' methods
        System.out.println("Account Title: " + myAccount.getAccountTitle());
        myAccount.printBalance();
        myAccount.withdrawBalance(500);
        System.out.println("Withdrawing 500 from myAccount...");
        myAccount.printBalance();
        myAccount.deposit(200);
        System.out.println("Depositing 200  myAccount...");
        myAccount.printBalance();
    
        System.out.println();
        
        // Two argument constructor
        Account yourAccount = new Account("Asad Ali", 1000);
        System.out.println("**********yourAccount**********");
        
        // Testing account class' methods
        System.out.println("Account Title: " + yourAccount.getAccountTitle());
        yourAccount.printBalance();
        yourAccount.withdrawBalance(700);
        System.out.println("Withdrawing 700 from yourAccount...");
        yourAccount.printBalance();
        yourAccount.deposit(100);
        System.out.println("Depositing 100 to yourAccount...");
        yourAccount.printBalance();
    }
}
