package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numOfFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double totalCost = 0;

        switch (flowers) {
            case "Roses":
                totalCost = numOfFlowers * 5.0;
                if (numOfFlowers > 80) {
                    totalCost = totalCost * 0.90;
                }
                break;
            case "Dahlias":
                totalCost = numOfFlowers * 3.80;
                if (numOfFlowers > 90) {
                    totalCost = totalCost * 0.85;
                }
                break;
            case "Tulips":
                totalCost = numOfFlowers * 2.80;
                if (numOfFlowers > 80) {
                    totalCost = totalCost * 0.85;
                }
                break;
            case "Narcissus":
                totalCost = numOfFlowers * 3.00;
                if (numOfFlowers < 120) {
                    totalCost = totalCost * 1.15;
                }
                break;
            case "Gladiolus":
                totalCost = numOfFlowers * 2.50;
                if (numOfFlowers < 80) {
                    totalCost = totalCost * 1.20;
                }
                break;
            default:
                break;
        }

        double rest = budget - totalCost;

        if (rest < 0) {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(rest));
        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    numOfFlowers, flowers, rest);
        }
    }
}
