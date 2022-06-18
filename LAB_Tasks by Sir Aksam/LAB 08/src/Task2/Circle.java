package Task2;

import java.util.Date;

import static java.lang.StrictMath.PI;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        this.radius = 0.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, Date dateCreated, double radius) {
        super(color, filled, dateCreated);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * getRadius();
    }
}
