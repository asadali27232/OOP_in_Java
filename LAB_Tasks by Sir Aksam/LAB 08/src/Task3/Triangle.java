package Task3;

import Task2.GeometricObject;

import java.util.Date;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;


    public Triangle() {
        this.side1 = 0.0;
        this.side2 = 0.0;
        this.side3 = 0.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, Date dateCreated, double side1, double side2, double side3) {
        super(color, filled, dateCreated);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return getSide1() * getSide2() * getSide3();
    }

    @Override
    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }
}
