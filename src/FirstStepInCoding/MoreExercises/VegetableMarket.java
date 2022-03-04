package FirstStepInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double EURO = 1.94;

        double priceKgVegiesBgn;
        double pricesKgFruitsBgn;
        int vegiesKg;
        int fruitsKg;

        double totalPriceBgn;
        double totalPriceEuro;

        priceKgVegiesBgn = Double.parseDouble(scanner.nextLine());
        pricesKgFruitsBgn = Double.parseDouble(scanner.nextLine());
        vegiesKg = Integer.parseInt(scanner.nextLine());
        fruitsKg = Integer.parseInt(scanner.nextLine());

        totalPriceBgn = priceKgVegiesBgn * vegiesKg + pricesKgFruitsBgn * fruitsKg;
        totalPriceEuro = totalPriceBgn / EURO;

        System.out.printf("%.2f", totalPriceEuro);
    }
}
