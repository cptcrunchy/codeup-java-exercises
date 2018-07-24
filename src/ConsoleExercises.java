import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a integer: ");
//        int num = sc.nextInt();
//        System.out.print("You entered " + num);

//        System.out.print("Enter the first word: ");
//        String word1 = sc.next();
//        System.out.print("Enter the second word: ");
//        String word2 = sc.next();
//        System.out.print("Enter the third word: ");
//        String word3 = sc.next();
//        System.out.printf("You entered \n%s \n%s \n%s", word1, word2, word3);

//        System.out.print("Enter a sentence: ");
//        String sentence = sc.nextLine();
//        System.out.print("You entered: " + sentence);

        System.out.print("Enter the length of the classroom: ");
        String len = sc.nextLine();
        System.out.print("Enter the width of the classroom: ");
        String wid = sc.nextLine();
        System.out.print("Enter the height of the classroom: ");
        String hgt = sc.nextLine();

        double length = Double.parseDouble(len);
        double width = Double.parseDouble(wid);
        double height = Double.parseDouble(hgt);

        double area = length * width;
        double perimeter = (2 * length) + (2 * width);
        double volume = length * width * height;
        System.out.printf("The area is %f\nThe perimeter is %f\nThe volume is %f", area, perimeter, volume);
    }

}
