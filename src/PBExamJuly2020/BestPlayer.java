package PBExamJuly2020;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int playerGoals = Integer.parseInt(scanner.nextLine());
        String bestPlayer = playerName;
        int maxGoals = playerGoals;

        while (playerGoals < 10) {
            playerName = scanner.nextLine();
            if (playerName.equals("END")) {
                break;
            }
            playerGoals = Integer.parseInt(scanner.nextLine());

            if (maxGoals < playerGoals) {
                maxGoals = playerGoals;
                bestPlayer = playerName;
            }
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
