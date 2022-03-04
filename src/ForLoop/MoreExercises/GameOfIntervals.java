package ForLoop.MoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entries = Integer.parseInt(scanner.nextLine());
        double sumPoints = 0;

        int numTo10 = 0;
        int numTo20 = 0;
        int numTo30 = 0;
        int numTo40 = 0;
        int numTo50 = 0;
        int numInvalid = 0;

        for (int i = 0; i < entries; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (number < 0 || number > 50) {
                sumPoints = sumPoints / 2;
                numInvalid++;
            } else if (number < 10) {
                sumPoints += 0.20 * number;
                numTo10++;
            } else if (number < 20) {
                sumPoints += 0.30 * number;
                numTo20++;
            } else if (number < 30) {
                sumPoints += 0.40 * number;
                numTo30++;
            } else if (number < 40) {
                sumPoints += 50;
                numTo40++;
            } else {
                sumPoints += 100;
                numTo50++;
            }
        }

        double percentTo10 = (double) numTo10 / entries * 100;
        double percentTo20 = (double) numTo20 / entries * 100;
        double percentTo30 = (double) numTo30 / entries * 100;
        double percentTo40 = (double) numTo40 / entries * 100;
        double percentTo50 = (double) numTo50 / entries * 100;
        double percentInvalid = (double) numInvalid / entries * 100;

        System.out.printf("%.2f%n", sumPoints);
        System.out.printf("From 0 to 9: %.2f%%%n", percentTo10);
        System.out.printf("From 10 to 19: %.2f%%%n", percentTo20);
        System.out.printf("From 20 to 29: %.2f%%%n", percentTo30);
        System.out.printf("From 30 to 39: %.2f%%%n", percentTo40);
        System.out.printf("From 40 to 50: %.2f%%%n", percentTo50);
        System.out.printf("Invalid numbers: %.2f%%", percentInvalid);
    }
}
