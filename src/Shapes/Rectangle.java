package Shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public void setWidth(double width) {
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * super.length) + (2 * super.width);
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }
}
