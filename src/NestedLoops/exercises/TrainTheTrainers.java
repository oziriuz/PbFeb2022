package NestedLoops.exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInJury = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int presentationCounter = 0;
        double sumAverage = 0;

        while (!command.equals("Finish")) {
            double sumGrades = 0;
            for (int i = 0; i < peopleInJury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;
            }
            System.out.printf("%s - %.2f.%n", command, sumGrades/peopleInJury);
            sumAverage += sumGrades/peopleInJury;
            presentationCounter++;
            command = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumAverage/presentationCounter);
    }
}
