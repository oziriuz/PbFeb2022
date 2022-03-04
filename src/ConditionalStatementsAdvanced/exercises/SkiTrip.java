package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // (positive) или (negative) . Ако оценката му е позитивна,
        // към цената с вече приспаднатото намаление - добавя 25% от нея.
        // Ако оценката му е негативна приспада от цената 10%.

        int days = Integer.parseInt(scanner.nextLine());
        int nights = days - 1;
        String type = scanner.nextLine();
        String opinion = scanner.nextLine();
        double discountCoef = 1;
        double pricePerNight = 0;
        double additive = 1;
        double totalCost;

        switch (type) {
            case "room for one person":
                pricePerNight = 18.00;
                break;
            case "apartment":
                pricePerNight = 25.00;
                if (days < 10) {
                    discountCoef = 0.70;
                } else if (days < 15) {
                    discountCoef = 0.65;
                } else {
                    discountCoef = 0.50;
                }
                break;
            case "president apartment":
                pricePerNight = 35.00;
                if (days < 10) {
                    discountCoef = 0.90;
                } else if (days < 15) {
                    discountCoef = 0.85;
                } else {
                    discountCoef = 0.80;
                }
                break;
            default:
                break;
        }

        if (opinion.equals("positive")) {
            additive = 1.25;
        }
        if (opinion.equals("negative")) {
            additive = 0.90;
        }

        totalCost = nights * pricePerNight * discountCoef * additive;

        System.out.printf("%.2f", totalCost);
    }
}
