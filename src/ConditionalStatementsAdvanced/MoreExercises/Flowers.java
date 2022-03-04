package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numH = Integer.parseInt(scanner.nextLine());
        int numR = Integer.parseInt(scanner.nextLine());
        int numT = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        char holiday = scanner.nextLine().charAt(0);
        double price = 0;

        switch (season) {
            case "Summer":
            case "Spring":
                price = numH * 2.00 + numR * 4.10 + numT * 2.50;
                break;
            case "Autumn":
            case "Winter":
                price = numH * 3.75 + numR * 4.50 + numT * 4.15;
                break;
            default:
                break;
        }

        if (holiday == 'Y') {
            price = price * 1.15; // 15 % for holidays
        }

        if (season.equals("Spring") && numT > 7) {
            price = 0.95 * price; //discount
        }
        if (season.equals("Winter") && numR >= 10) {
            price = 0.90 * price; //discount
        }
        if (numH + numR + numT > 20) {
            price = 0.80 * price;
        }

        price += 2; //for packing

        System.out.printf("%.2f", price);
    }
}
