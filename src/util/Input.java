package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public void getInt(int min, int max) {
        int num;
        do {
            System.out.print("Enter an number: ");
            num = getInt();
        } while (!(num >= min && num <= max));
    }

    public void getDouble(double min, double max) {
        double num;
        do {
            System.out.print("Enter an number: ");
            num = getDouble();
        } while (!(num >= min && num <= max));
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public String getString() {
        return scanner.nextLine().toLowerCase().trim();
    }

    public boolean yesNo() {
        String string = getString();
        return string.equals("y") || string.equals("yes");
    }
}
