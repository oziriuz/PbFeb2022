package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String typePlace;
        String place;
        double price;

        if (season.equals("Summer")) {
            place = "Alaska";
        } else {
            place = "Morocco";
        }

        if (budget <= 1000) {
            typePlace = "Camp";
            if (season.equals("Summer")) {
                price = 0.65 * budget;
            } else {
                price = 0.45 * budget;
            }
        } else if (budget <= 3000) {
            typePlace = "Hut";
            if (season.equals("Summer")) {
                price = 0.80 * budget;
            } else {
                price = 0.60 * budget;
            }
        } else {
            typePlace = "Hotel";
            price = 0.90 * budget;
        }

        System.out.printf("%s - %s - %.2f", place, typePlace, price);
    }
}
