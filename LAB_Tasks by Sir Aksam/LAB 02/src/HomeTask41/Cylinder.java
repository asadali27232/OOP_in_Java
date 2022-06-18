// dev: SP21-BCS-007

package HomeTask41;

public class Cylinder {
    private double radius;
    private double height;
    
    // Constructors
    public Cylinder(double height, double radius) {
        this.radius = radius;
        this.height = height;
    }
    
    public Cylinder(double height) {
        this.height = height;
        this.radius = 1.0;
    }
    
    public Cylinder() {
        this.radius = 0.0;
        this.height = 0.0;
    }
    // Setters and Getters
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    // Computing Surface Area
    private double computeSurfaceArea(){
        double surfaceArea = 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
        return surfaceArea;
        
    }
    // Computing Volume
    private double computeVolume(){
        double volume = Math.PI*radius*radius*height;
        return volume;
    }
    // Displaying Info of Cylinder
    public void displayCylinderInfo(){
        System.out.println("Radius of Cylinder = " + getRadius());
        System.out.println("Height of Cylinder = " + getHeight());
        System.out.println("Surface Area of Cylinder = " + computeSurfaceArea());
        System.out.println("Volume of Cylinder = " + computeVolume());
    }
}

