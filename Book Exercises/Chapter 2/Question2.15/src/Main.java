import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int x = input.nextInt();
        System.out.print("Enter Second Number: ");
        int y = input.nextInt();
        int sqX = x*x;
        int sqY = y*y;
        int sqSum = sqY + sqX;
        int sqDif = sqX - sqY;
        System.out.printf("Square of First Number is: %d%n", sqX);
        System.out.printf("Square of Second Number is: %d%n", sqY);
        System.out.printf("Sum of Squares is: %d%n", sqSum);
        System.out.printf("Sum of Squares is: %d%n", sqDif);
    }
}
