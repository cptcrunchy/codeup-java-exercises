package Shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        do {
            System.out.println("Enter the radius: ");
            Circle circle = new Circle(input.getDouble());
            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());

            System.out.println("Would you like to enter another[y/n]: ");
            input.getString();
        } while (input.yesNo());
    }
}
