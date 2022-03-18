package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination;
        String place = "";
        double totalCost = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                place = "Camp";
                totalCost = budget * 0.3;
            }
            if (season.equals("winter")) {
                totalCost = budget * 0.7;
                place = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                totalCost = budget * 0.4;
                place = "Camp";
            }
            if (season.equals("winter")) {
                totalCost = budget * 0.8;
                place = "Hotel";
            }
        } else {
            destination = "Europe";
            totalCost = budget * 0.9;
            place = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, totalCost);

    }
}
