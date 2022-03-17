package WhileLoop.lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        double grade;
        double sumGrades = 0;
        int studentClass = 0;
        boolean firstFault = false;

        while (studentClass < 12) {
            grade = Double.parseDouble(scanner.nextLine());
            sumGrades += grade;
            if (firstFault && grade < 4.0) {
                System.out.printf("%s has been excluded at %d grade%n", student, studentClass);
                return;
            }
            if (grade < 4.0) {
                firstFault = true;
            }
            studentClass++;
        }
        System.out.printf("%s graduated. Average grade: %.2f", student, sumGrades/12);
    }
}
