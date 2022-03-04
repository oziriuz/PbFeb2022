package ForLoop.exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfTours = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int winnerTours = 0;

        for (int i = 0; i < numOfTours; i++) {
            String reach = scanner.nextLine();

            switch (reach) {
                case "W":
                    points += 2000;
                    winnerTours++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("Final points: %d%n", points + startPoints);
        System.out.printf("Average points: %.0f %n", Math.floor((double) points / numOfTours));
        System.out.printf("%.2f%%", (double) winnerTours / numOfTours * 100);
    }
}
