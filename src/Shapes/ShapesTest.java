package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5.0, 5.0);
        Rectangle box2 = new Square(6.0);

        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }
}
