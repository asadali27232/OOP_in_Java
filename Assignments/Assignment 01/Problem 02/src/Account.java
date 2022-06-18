// dev: SP21-BCS-007
public class Account {
    private int id;
    private double balance;
    
    // Constructors
    public Account(int id){
        setId(id);
        setBalance(100);
    }
    
    public Account(int id, double balance) {
        setId(id);
        setBalance(balance);
    }
    // Getter
    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
    // Setter
    public void setId(int id) {
        this.id = id;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // Print Balance
    public void checkBalance() {
         System.out.println("Your Current Balance is: " + getBalance() + "$");
    }
    
    // Deposit
    public void deposit(double amount){
        if (amount > 0 )
            setBalance(getBalance() + amount);
    }
    
    // Withdraw balance
    public void withdraw(double amount){
        if (amount < 0)
            System.out.println("Please Enter correct withdraw amount!");
        if (amount > getBalance())
            System.out.println("You do not have sufficient balance to complete this transaction.");
        else
            setBalance(getBalance() - amount);
    }
}






