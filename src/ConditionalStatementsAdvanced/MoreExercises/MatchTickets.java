package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine().trim());

        double priceVIP = 499.99;
        double priceNormal = 249.99;

        double transport;
        if (people < 5) {
            transport = 0.75 * budget;
        } else if (people < 10) {
            transport = 0.60 * budget;
        } else if (people < 25) {
            transport = 0.50 * budget;
        } else if (people < 50) {
            transport = 0.40 * budget;
        } else {
            transport = 0.25 * budget;
        }

        double budgetLeft = budget - transport;

        double totalCost = 0;

        switch (category) {
            case "VIP":
                totalCost = priceVIP * people;
                break;
            case "Normal":
                totalCost = priceNormal * people;
                break;
            default:
                break;
        }

        double moneyLeft = budgetLeft - totalCost;

        if (moneyLeft < 0) {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(moneyLeft));
        } else {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        }
    }
}
