package PBExamMarch2022;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int numKids = 0;
        int numAdults = 0;

        while (!command.equals("Christmas")) {
            int age = Integer.parseInt(command);
            if (age <= 16) {
                numKids++;
            } else {
                numAdults++;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Number of adults: %d%n", numAdults);
        System.out.printf("Number of kids: %d%n", numKids);
        System.out.printf("Money for toys: %d%n", numKids * 5);
        System.out.printf("Money for sweaters: %d", numAdults * 15);
    }
}
