import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Say something to Bob");
        String input = sc.nextLine();

        if (input.endsWith("?")) {
            System.out.println("Bob says: Sure");
        } else if (input.endsWith("!")) {
            System.out.println("Bob says: Whoa, chill out!");
        } else if (input.equals("")) {
            System.out.println("Bob says: Fine. Be that way!");
        } else {
            System.out.println("Bob says: Whatever.");
        }

    }

}
