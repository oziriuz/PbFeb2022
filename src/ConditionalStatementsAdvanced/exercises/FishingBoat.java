package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double totalCost = 0.0;

        switch (season) {
            case "Spring":
                totalCost = 3000;
                break;
            case "Summer":
            case "Autumn":
                totalCost = 4200;
                break;
            case "Winter":
                totalCost = 2600;
                break;
            default:
                break;
        }

        if (people <= 6) {
            totalCost = totalCost * 0.9;
        } else if (people <= 11) {
            totalCost = totalCost * 0.85;
        } else {
            totalCost = totalCost * 0.75;
        }

        if (people % 2 == 0 && !season.equals("Autumn")){
            totalCost = totalCost * 0.95;
        }

        double rest = budget - totalCost;

        if (rest < 0) {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(rest));
        } else {
            System.out.printf("Yes! You have %.2f leva left.", rest);
        }
    }
}
