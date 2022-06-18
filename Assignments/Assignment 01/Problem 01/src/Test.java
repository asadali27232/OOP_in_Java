
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
    	MyPoint pt1 = new MyPoint(0,0);
        MyPoint pt2 = new MyPoint(10, 30.5);

        System.out.printf("%nThe distnace of the given points is: %.2f %n%n", pt1.distance(pt2));

        System.out.println("Entered points forms Polygone: " + isPolygone(getPointsArray()));
    }

    public static MyPoint[] getPointsArray(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many sides your polygone have: ");
        int sides = input.nextInt();

        MyPoint[] points = new MyPoint[sides];
        
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x cordinate of the " + (i+1) + " point: ");
            double x = input.nextDouble();
            System.out.print("Enter y cordinate of the " + (i+1) + " point: ");
            double y = input.nextDouble();

            points[i] = new MyPoint(x, y);
        }
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
        return points;
    }
    public static boolean isPolygone(MyPoint[] points) {
        boolean polygoneFlag = false;
        if(points[0].getX() == points[points.length - 1].getX() && points[0].getY() == points[points.length - 1].getY())
            polygoneFlag = true;
        else
            polygoneFlag = false;
        return polygoneFlag;
    }
}











