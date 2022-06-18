package Task3;

import java.util.Scanner;

public class GeometricTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.print("Enter Triangle Color: ");
        triangle.setColor(input.nextLine());

        System.out.print("Enter Triangle if Filled -> true if nor filled -> false: ");
        triangle.setFilled(input.nextBoolean());

        System.out.print("Enter side1 : ");
        triangle.setSide1(input.nextDouble());

        System.out.print("Enter side2 : ");
        triangle.setSide2(input.nextDouble());

        System.out.print("Enter side3 : ");
        triangle.setSide3(input.nextDouble());

        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
