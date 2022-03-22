//dev: SP21-BCS-007

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of the circle: ");
        double radius = input.nextDouble();

        Circle c = new Circle();

        System.out.println("Area of circle is: " + c.area(radius));
        System.out.println("Circumference of circle is: " + c.circumference(radius));

    }
}
