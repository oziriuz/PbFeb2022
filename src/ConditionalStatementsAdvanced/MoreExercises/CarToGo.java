package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass;
        String typeCar;
        double price;

        if (season.equals("Summer") && budget <= 500) {
            typeCar = "Cabrio";
        } else {
            typeCar = "Jeep";
        }

        if (budget <= 100) {
            carClass = "Economy class";
            if (typeCar.equals("Cabrio")) {
                price = 0.35 * budget;
            } else {
                price = 0.65 * budget;
            }
        } else if (budget <= 500) {
            carClass = "Compact class";
            if (typeCar.equals("Cabrio")) {
                price = 0.45 * budget;
            } else {
                price = 0.80 * budget;
            }
        }else {
            carClass = "Luxury class";
            price = 0.90 * budget;
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", typeCar, price);
    }
}
