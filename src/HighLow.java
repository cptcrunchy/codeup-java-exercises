import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println(randomNumber);

        System.out.println("Try and guess the random number");
        System.out.print("Enter your guess: ");
        int guess = sc.nextInt();

        while (guess != randomNumber) {
            if (guess < randomNumber) {
                System.out.print("HIGHER: ");
                guess = sc.nextInt();
            } else {
                System.out.print("LOWER: ");
                guess = sc.nextInt();
            }
        }
        System.out.print("GOOD GUESS!");
    }

}
