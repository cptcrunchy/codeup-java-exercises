package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        do {
            System.out.println("Enter the radius: ");
            Circle circle = new Circle(input.getDouble());
            System.out.println("The circumference is: " + circle.getArea());
            System.out.println("The area is: " + circle.getCircumference());

            System.out.println("Would you like to enter another[y/n]: ");
            input.getString();
        } while (input.yesNo());
    }
}
