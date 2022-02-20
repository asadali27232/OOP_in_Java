import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to my First GUI Application");
        Scanner input = new Scanner(System.in);
        String str1 = JOptionPane.showInputDialog("Enter First Integer");
        int x = Integer.parseInt(str1);
        String str2 = JOptionPane.showInputDialog("Enter Second an Integer");
        int y = Integer.parseInt(str2);
        int sum = x+y;
        String str3 = String.format("Sum of %d + %d is equal to %d", x,y,sum);
        JOptionPane.showMessageDialog(null, str3);

    }
}
