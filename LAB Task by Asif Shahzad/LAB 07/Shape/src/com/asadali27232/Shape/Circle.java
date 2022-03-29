package com.asadali27232.Shape;

import static java.lang.Math.*;
import com.asadali27232.Enum.COLOR;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        setRadius(radius);
    }

    public Circle(boolean filled, COLOR color, double radius) {
        super(filled, color);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + "Radius of Circle: " + getRadius() + "\n";
    }

    @Override
    public double getArea() {
        return PI * pow(getRadius(), 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * getRadius();
    }
}