package ConditionalStatements.exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int artists = Integer.parseInt(scanner.nextLine());
        double priceArtistClothes = Double.parseDouble(scanner.nextLine());

        double priceDecorations = 0.1 * budget;

        double priceAllClothes = artists * priceArtistClothes;

        if (artists > 150) {
            priceAllClothes = priceAllClothes * 0.9;
        }

        double totalCost = priceAllClothes + priceDecorations;

        double rest = budget - totalCost;
        if(rest < 0) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(rest));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(rest));
        }
    }
}
