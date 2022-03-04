package ForLoop.MoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCap = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        int peopleA = 0;
        int peopleB = 0;
        int peopleV = 0;
        int peopleG = 0;

        for (int i = 0; i < people; i++) {
            char sector = scanner.nextLine().charAt(0);
            switch (sector) {
                case 'A':
                    peopleA++;
                    break;
                case 'B':
                    peopleB++;
                    break;
                case 'V':
                    peopleV++;
                    break;
                case 'G':
                    peopleG++;
                    break;
                default:
                    break;
            }
        }

        double perA = (double) peopleA / people * 100;
        double perB = (double) peopleB / people * 100;
        double perV = (double) peopleV / people * 100;
        double perG = (double) peopleG / people * 100;
        double percentage = (double) people / totalCap * 100;

        System.out.printf("%.2f%%%n", perA);
        System.out.printf("%.2f%%%n", perB);
        System.out.printf("%.2f%%%n", perV);
        System.out.printf("%.2f%%%n", perG);
        System.out.printf("%.2f%%%n", percentage);
    }
}
