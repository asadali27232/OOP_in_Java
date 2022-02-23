//dev: SP21-BCS-007
public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        
        rec.setLength(2);
        rec.setWidth(3);
        
        double area  = rec.getArea();
        double perimeter = rec.getPerimeter();
        
        System.out.println("Area of rectangle is: " + area +
                " and Perimeter is : " + perimeter);
        
    }
}
