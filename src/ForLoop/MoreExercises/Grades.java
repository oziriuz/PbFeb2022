package ForLoop.MoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scanner.nextLine());
        double sumGrades = 0;
        int grade23 = 0;
        int grade34 = 0;
        int grade45 = 0;
        int grade56 = 0;

        for (int i = 0; i < numOfStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            sumGrades += grade;
            if (grade < 3) {
                grade23++;
            } else if (grade < 4) {
                grade34++;
            } else if (grade < 5) {
                grade45++;
            } else {
                grade56++;
            }
        }
        double avGrade = sumGrades / numOfStudents;
        double percent23 = (double) grade23 / numOfStudents * 100;
        double percent34 = (double) grade34 / numOfStudents * 100;
        double percent45 = (double) grade45 / numOfStudents * 100;
        double percent56 = (double) grade56 / numOfStudents * 100;

        System.out.printf("Top students: %.2f%%%n", percent56);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percent45);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percent34);
        System.out.printf("Fail: %.2f%%%n", percent23);
        System.out.printf("Average: %.2f", avGrade);

    }
}
