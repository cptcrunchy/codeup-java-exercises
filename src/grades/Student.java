package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;

        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Jeff");
        Student student2 = new Student("John");
        Student student3 = new Student("Jake");

        student1.addGrade(100);
        student1.addGrade(89);
        student1.addGrade(54);
        student1.addGrade(78);
        student2.addGrade(90);
        student2.addGrade(97);
        student2.addGrade(91);
        student3.addGrade(80);
        student3.addGrade(86);
        student3.addGrade(81);

        System.out.printf("%s average grade is %f\n", student1.getName(), student1.getGradeAverage());
        System.out.printf("%s average grade is %f\n", student2.getName(), student2.getGradeAverage());
        System.out.printf("%s average grade is %f\n", student3.getName(), student3.getGradeAverage());
    }
}
