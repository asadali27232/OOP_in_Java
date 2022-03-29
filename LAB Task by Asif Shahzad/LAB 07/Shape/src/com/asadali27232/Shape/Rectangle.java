package com.asadali27232.Shape;

import com.asadali27232.Enum.COLOR;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super();
        setLength(0.0);
        setWidth(0.0);
    }

    public Rectangle(boolean filled, COLOR color, double length, double width) {
        super(filled, color);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle Length: " + getLength() + "\n" +
                "Rectangle Width; " + getWidth() + "\n";
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }
}
