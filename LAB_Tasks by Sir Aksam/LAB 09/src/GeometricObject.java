public abstract class GeometricObject implements StatsComputable{
    private String color;
    private boolean filled;

    protected GeometricObject() {
        this.color = null;
        this.filled = false;
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
