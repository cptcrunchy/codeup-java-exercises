package Shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return 4 * super.length;
    }

    @Override
    public double getPerimeter() {
        return Math.pow(super.length, 2);
    }
}
