package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        boolean flag = true;

        students.put("jeeefff", new Student("Jeff"));
        students.put("jOhn45%", new Student("John"));
        students.put("<jake/>", new Student("Jake"));
        students.put("j33ry", new Student("Jerry"));

        students.get("jeeefff").addGrade(87);
        students.get("jeeefff").addGrade(89);
        students.get("jeeefff").addGrade(99);

        students.get("jOhn45%").addGrade(100);
        students.get("jOhn45%").addGrade(90);
        students.get("jOhn45%").addGrade(80);

        students.get("<jake/>").addGrade(56);
        students.get("<jake/>").addGrade(76);
        students.get("<jake/>").addGrade(34);

        students.get("j33ry").addGrade(98);
        students.get("j33ry").addGrade(88);
        students.get("j33ry").addGrade(78);

        System.out.println("Here are the github usernames of our students: ");

        for (String key : students.keySet()) {
            System.out.printf("|%s| ", key);
        }

        while (flag) {
            System.out.println("\nWhich student which you would like to see more information on?");
            System.out.print("> ");
            String choice = input.nextLine();

            if (!students.containsKey(choice)) {
                System.out.printf("\nSorry, no student found with the gihub username of %s\n", choice);
            } else {
                System.out.printf("Name: %s - Github Username: %s\n", students.get(choice).getName(), choice);
                System.out.printf("Current average: %f\n", students.get(choice).getGradeAverage());
            }

            System.out.println("Would you like to see another student?");
            System.out.print("> ");
            String keepGoing = input.nextLine();

            flag = keepGoing.equals("y") || keepGoing.equals("yes");
        }
        System.out.println("Goodbye, and have a wonderful day!");
    }

}
