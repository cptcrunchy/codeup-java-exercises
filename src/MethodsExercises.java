import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println(add(5, 10));
//        System.out.println(subtract(10.75, 2.50));
//        System.out.println(multiply(54, 13));
//        System.out.println(divide(5, 5));
//        System.out.println(modulo(10, 5));

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

//        facto();

        dice();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulo(double num1, double num2) {
        return num1 % num2;
    }

//    public static int getInteger(int min, int max) {
//        return;
//    }

    public static void facto () {

        boolean cont = true;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            long factNum = sc.nextLong();

            while (factNum < 1 || factNum > 10) {
                System.out.print("That is not a number between 1 and 10\nEnter another number: ");
                factNum = sc.nextLong();
            }

            String factorials = "";

            for (int i = 1; i <= factNum; i++) {
                factorials += Integer.toString(i) + " x ";
            }

            System.out.printf("%d! = %s = %d", factNum, (factorials.substring(0, factorials.length() - 2)).trim(), factorial(factNum));

            sc.nextLine();
            System.out.print("\nWould you like to continue?: ");
            String keepGoing = sc.nextLine();
            if (keepGoing.equals("no") || keepGoing.equals("n")) {
                cont = false;
            }
        } while (cont);

    }

    public static long factorial(long number) {

        if (number == 0) {
            return 1;
        }

        return number*factorial(number - 1);
    }

    public static void dice() {

        boolean cont = true;

        do {
            System.out.print("Enter the number of sides for the two dice: ");
            int sides = sc.nextInt();

            System.out.println("Rolling....");
            int roll1 = roll(sides);
            int roll2 = roll(sides);

            System.out.printf("Dice 1: %d   Dice 2: %d\n", roll1, roll2);

            sc.nextLine();
            System.out.print("Would you like to roll again?: ");
            String keepGoing = sc.nextLine();

            if (keepGoing.equals("no") || keepGoing.equals("n")) {
                cont = false;
            }

        } while (cont);
    }

    public static int roll (int numOfSides) {
        Random rand = new Random();
        return rand.nextInt(numOfSides) + 1;
    }
}
