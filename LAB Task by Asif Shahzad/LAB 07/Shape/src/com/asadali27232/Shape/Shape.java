package com.asadali27232.Shape;

import com.asadali27232.Enum.COLOR;

public class Shape {
    private boolean filled;
    private COLOR color;

    protected Shape() {
        setColor(null);
        setFilled(false);
    }

    protected Shape(boolean filled, COLOR color) {
        setColor(color);
        setFilled(filled);

    }

    protected boolean isFilled() {
        return filled;
    }

    protected void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected COLOR getColor() {
        return color;
    }

    protected void setColor(COLOR color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nShape Color :" + getColor() + "\n" +
                "Shape Filled: " + isFilled() + "\n";
    }

    protected double getArea() {
        return 0.0;
    }

    protected double getPerimeter() {
        return 0.0;
    }


}
