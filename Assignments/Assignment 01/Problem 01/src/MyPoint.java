public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        setX(0);
        setY(0);
    }

    public MyPoint(double x, double y) {
        setX(x);
        setY(y);
    }

    public MyPoint(MyPoint point) {
        setX(point.x);
        setY(point.y);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.x = y;
    }
    
    public String toString() {
        String string = "(" + getX() + "," + getY() + ")";
        return string;
    }

    public double distance(MyPoint point) {
        double distance = Math.sqrt(Math.pow((point.x-getX()),2)+Math.pow((point.y-getY()),2));
        return distance;
    }

    public double distance(double x, double y) {
        double distance = Math.sqrt(Math.pow((x-getX()),2)+Math.pow((y-getY()),2));
        return distance;
    }
}








