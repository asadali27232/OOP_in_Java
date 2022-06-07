import java.util.ArrayList;

public class TestCircle {
    public static void main(String[] args) {
        ArrayList<GeometricObject> geometricObjects = new ArrayList<>(5);

        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(3);

        ResizeableCircle rc1 = new ResizeableCircle(1);
        ResizeableCircle rc2 = new ResizeableCircle(2);

        geometricObjects.add(c1);
        geometricObjects.add(c2);
        geometricObjects.add(c3);
        geometricObjects.add(rc1);
        geometricObjects.add(rc2);

        for (int i = 0; i < geometricObjects.size(); i++) {
            System.out.println("Area = " + geometricObjects.get(i).getArea());
            System.out.println("Perimeter = " + geometricObjects.get(i).getPerimeter());
            System.out.println();
        }

        Circle[] circles = new Circle[5];
        int circleCounter = 0;

        ResizeableCircle[] resizeableCircles = new ResizeableCircle[5];
        int resizeableCircleCounter = 0;

        for (GeometricObject geometricObject : geometricObjects) {
            if (geometricObject instanceof Circle) {
                circles[circleCounter] = (Circle) geometricObject;
                circleCounter++;
            }
            if (geometricObject instanceof ResizeableCircle) {
                resizeableCircles[resizeableCircleCounter] = (ResizeableCircle) geometricObject;
                resizeableCircleCounter++;
            }
        }

        for (int i = 0; i < (circleCounter < resizeableCircleCounter ? circleCounter : resizeableCircleCounter); i++) {
            if (circles[i].getRadius() == resizeableCircles[i].getRadius()) {
                System.out.println("Area of Circle = " + circles[i].getArea());
                System.out.println("Area of Resizeable Circle = " + resizeableCircles[i].getArea());
                System.out.println();
            }
        }
    }
}
