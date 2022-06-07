import static java.lang.Math.*;

public class Circle extends GeometricObject {
    protected double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * PI * getRadius();
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = PI * pow(getRadius(), 2);
        return area;
    }

}
