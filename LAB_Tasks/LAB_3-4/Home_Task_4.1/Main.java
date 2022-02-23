public class Main {

    public static void main(String[] args) {
        //Creating Objects of Cylinder Class
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(10);
        Cylinder c3 = new Cylinder(10, 25);
        
        c1.displayCylinderInfo();
        System.out.println();
        c2.displayCylinderInfo();
        System.out.println();
        c3.displayCylinderInfo();
        
    }
}
