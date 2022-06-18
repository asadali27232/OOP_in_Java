import javax.management.InvalidAttributeValueException;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    private double rectArea;
    private double rectPerimeter;

    public Rectangle() {
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRectArea() throws InvalidAttributeValueException {
        if (rectArea == 0) {
            throw new InvalidAttributeValueException();
        } else
            return rectArea;
    }

    public double setRectArea(double rectPerimeter) {
        return rectArea;
    }

    public double getRectPerimeter() throws InvalidAttributeValueException {
        if (rectPerimeter == 0) {
            throw new InvalidAttributeValueException();
        } else
            return rectPerimeter;
    }

    public void setRectPerimeter(double rectPerimeter) {
        this.rectPerimeter = rectPerimeter;
    }

    @Override
    public String toString() {
        return super.toString() +"Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", rectArea=" + rectArea +
                ", rectPerimeter=" + rectPerimeter +
                '}';
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getHeight() + getWidth());
    }

    @Override
    public void computeStats() {

    }

    @Override
    public void reset() {
        setRectPerimeter(0);
        setRectArea(0);
    }
}
