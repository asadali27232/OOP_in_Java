public class ResizeableCircle extends Circle {

    public ResizeableCircle() {
        super();
    }

    public ResizeableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        super.setRadius(super.getRadius() + (super.getRadius() * (percent / 100.0)));
    }

}
