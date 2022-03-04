package FirstStepInCoding.exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PENS_PRICE = 5.80;
        final double MARKERS_PRICE = 7.20;
        final double DETERGENT_PRICE = 1.20;

        int packsOfPens;
        int packsOfMarkers;
        int litersOfDetergent;
        double discount;

        double pricePens;
        double priceMarkers;
        double priceDetergent;
        double totalSum;

        packsOfPens = Integer.parseInt(scanner.nextLine());
        packsOfMarkers = Integer.parseInt(scanner.nextLine());
        litersOfDetergent = Integer.parseInt(scanner.nextLine());
        discount = Double.parseDouble(scanner.nextLine());

        pricePens = packsOfPens * PENS_PRICE;
        priceMarkers = packsOfMarkers * MARKERS_PRICE;
        priceDetergent = litersOfDetergent * DETERGENT_PRICE;
        totalSum = pricePens + priceMarkers + priceDetergent;
        totalSum = totalSum * (1 - discount/100);
        System.out.println(totalSum);

    }
}
