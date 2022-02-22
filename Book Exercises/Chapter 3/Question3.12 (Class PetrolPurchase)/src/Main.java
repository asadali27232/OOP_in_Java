import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
    PetrolPurchase pump = new PetrolPurchase("Lahore", "High Octane", 500, 160, 2 );
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Petrol Quantity in Litters: ");
    int amount = input.nextInt();
    //Testing PetrolPurchase Class
    double price = pump.getPurchasePrice(amount);
    
    //Format for GUI JOptionPane
    String message =
            String.format("***********************************************%n%nPetrol Pump Location: %s%nPetrol Type: " +
                            "%s%nPrice per Litter: %.2f%nToday's Discount: %.2f%n PercentQuantity in Litter : " +
                            "%d%nPurchase Amount %.2fRs/=%n%nThanks for Your Purchase...." +
                    ".!%n%n***********************************************",pump.getLocation(),pump.getType(),
                    pump.getPrice(),pump.getDiscount(),amount,price);
    
    
    System.out.println("***********************************************");
    System.out.println("*                  Invoice                    *");
    System.out.println("***********************************************");
    System.out.printf("%nPetrol Pump Location: %s%n", pump.getLocation());
    System.out.printf("Petrol Type: %s%n", pump.getType());
    System.out.printf("Price per Litter: %.2f%n", pump.getPrice());
    System.out.printf("Today's Discount: %.2f Percent%n", pump.getDiscount());
    System.out.printf("Quantity in Litter : %d%n", amount);
    System.out.printf("Purchase Amount %.2fRs/=%n", price);
    System.out.printf("%nThanks for Your Purchase.....!%n%n");
    System.out.println("***********************************************");
    
    //JOptionPane.showMessageDialog(null, "HelloWorld");
    }
}
