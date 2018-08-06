package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Square(5.0);
        Measurable myShape2 = new Rectangle(5.0, 4.0);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }
}
