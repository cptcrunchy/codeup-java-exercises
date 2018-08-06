package shapes;

public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getCircumference() {
        return 2.0 * Math.PI * radius;
    }
}
