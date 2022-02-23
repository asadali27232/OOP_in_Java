//dev: SP21-BCS-007
public class Circle {
    private double radius;


    public Circle(){
        radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r){
        radius = r;
    }

    public double area(double r){
        radius = r;
        return (3.14*radius*radius);
    }
    public double circumference(double r){
        radius = r;
        return (2*3.14*radius);
    }
}
