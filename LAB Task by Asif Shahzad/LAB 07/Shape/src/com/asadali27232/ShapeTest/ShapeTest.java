package com.asadali27232.ShapeTest;

import com.asadali27232.Enum.COLOR;
import com.asadali27232.Shape.Circle;
import com.asadali27232.Shape.Rectangle;
import com.asadali27232.Shape.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(true, COLOR.RED, 2.2);
        Circle c2 = new Circle(false, COLOR.BLUE, 10);
        System.out.println(c1);
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());

        System.out.println(c2);
        System.out.println("Area of c2: " + c2.getArea());
        System.out.println("Perimeter of c2: " + c2.getPerimeter());

        Rectangle r1 = new Rectangle(true, COLOR.BLACK, 5.5, 6);
        Rectangle r2 = new Rectangle(false, COLOR.GREEN, 50, 56);
        System.out.println(r1);
        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());

        System.out.println(r2);
        System.out.println("Area of r2: " + r2.getArea());
        System.out.println("Perimeter of r2: " + r2.getPerimeter());

        printEachShapeCount(r1, r2, c1, c2);
    }

    public static void printEachShapeCount(Shape... shapes) {
        int circleCount = 0;
        int rectangleCount = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle)
                ++circleCount;
            if (shape instanceof Rectangle)
                ++rectangleCount;
        }
        System.out.println("Number of Circles : " + circleCount);
        System.out.println("Number of Rectangles: " + rectangleCount);
    }
}



