import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }

//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

//        for (long i = 2L; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("What number would you like to go upto?: ");
//        int num = sc.nextInt();
//        int i = 1;
//
//        System.out.print("number | squared | cubed\n");
//        System.out.print("------------------------\n");
//        while (i <= num) {
//            System.out.print(i + "      | " + i*i + "      | " + i*i*i + "\n");
//            i++;
//        }

        boolean cont = true;

        do {
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter a grade: ");
            int grade = sc.nextInt();

            if (grade <= 100 && grade >= 88) {
                System.out.println("A");
            } else if (grade < 88 && grade >= 80) {
                System.out.println("B");
            } else if (grade < 80 && grade >= 67) {
                System.out.println("C");
            } else if (grade < 67 && grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            sc.nextLine();

            System.out.print("Do you want to continue?: ");
            String ans = sc.nextLine();

            if (ans.equals("no") || ans.equals("n")) {
                cont = false;
            }
        } while (cont);
    }

}
