import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = input.nextInt();
        int sq = x*x;
        if (x>100)
        {
            System.out.printf("Number %d is greater then 100.%n", x);
        }
        if (x<100)
        {
            System.out.printf("Number %d is less then 100.%n", x);
        }
        if (x==100)
        {
            System.out.printf("Number %d is Equal to 100.%n", x);
        }
        if (sq>100)
        {
            System.out.printf("The Square %d of Number %d is greater then 100.%n", sq, x);
        }
        if (sq<100)
        {
            System.out.printf("The Square %d of Number %d is less then 100.%n", sq, x);
        }
        if (sq==100)
        {
            System.out.printf("The Square %d of Number %d is equal to 100.%n", sq, x);
        }
    }
}
