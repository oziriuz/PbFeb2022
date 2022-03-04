package FirstStepInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRICE_MUSSELS_KG = 7.50;

        double priceMackarelKg;
        double priceSpratKg;
        double bonitoKg;
        double scadKg;
        int musselsKg;

        double priceBonitoKg;
        double priceScadKg;
        double totalPrice;

        priceMackarelKg = Double.parseDouble(scanner.nextLine());
        priceSpratKg = Double.parseDouble(scanner.nextLine());
        bonitoKg = Double.parseDouble(scanner.nextLine());
        scadKg = Double.parseDouble(scanner.nextLine());
        musselsKg = Integer.parseInt(scanner.nextLine());

        priceBonitoKg = priceMackarelKg * 1.6;
        priceScadKg = priceSpratKg * 1.8;

        totalPrice = bonitoKg * priceBonitoKg + scadKg * priceScadKg + musselsKg * PRICE_MUSSELS_KG;

        System.out.printf("%.2f", totalPrice);
    }
}
