package PBExamMarch2020;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfTournament = Integer.parseInt(scanner.nextLine());
        double totalMoneyWon = 0;
        int daysWon = 0;
        int daysLost = 0;

        for (int i = 0; i < daysOfTournament; i++) {
            String sport = scanner.nextLine();
            String winLose = scanner.nextLine();
            int wonGames = 0;
            int lostGames = 0;
            double moneyForToday = 0;

            while (!sport.equals("Finish")) {
                switch (winLose) {
                    case "win":
                        wonGames++;
                        moneyForToday += 20;
                        break;
                    case "lose":
                        lostGames++;
                        break;
                    default:
                        break;
                }
                sport = scanner.nextLine();
                if (sport.equals("Finish")) {
                    break;
                }
                winLose = scanner.nextLine();
            }
            if (wonGames > lostGames) {
                moneyForToday = moneyForToday * 1.1;
                daysWon++;
            } else {
                daysLost++;
            }
            totalMoneyWon += moneyForToday;
        }

        if (daysWon > daysLost) {
            totalMoneyWon = totalMoneyWon * 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoneyWon);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoneyWon);
        }
    }
}
