package FirstStepInCoding.exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRICE_NYLON_SQM = 1.50;
        final double PRICE_PAINT_L = 14.50;
        final double PRICE_THINNER_L = 5.00;
        final  double PRICE_BAGS = 0.40;

        int quantityNylon;
        double quantityPaint;
        int quantityThinner;
        int workHours;

        double totalPriceNylon;
        double totalPricePaint;
        double totalPriceThinner;
        double priceOneHourWork;
        double totalPriceWork;
        double totalPriceMaterials;
        double totalPrice;

        quantityNylon = Integer.parseInt(scanner.nextLine());
        quantityPaint = Integer.parseInt(scanner.nextLine());
        quantityThinner = Integer.parseInt(scanner.nextLine());
        workHours = Integer.parseInt(scanner.nextLine());

        quantityNylon = quantityNylon + 2;
        quantityPaint = quantityPaint * 1.1;

        totalPriceNylon = quantityNylon * PRICE_NYLON_SQM;
        totalPricePaint = quantityPaint * PRICE_PAINT_L;
        totalPriceThinner = quantityThinner * PRICE_THINNER_L;
        totalPriceMaterials = totalPriceNylon + totalPricePaint + totalPriceThinner + PRICE_BAGS;
        priceOneHourWork = totalPriceMaterials * 0.3;
        totalPriceWork = priceOneHourWork * workHours;
        totalPrice = totalPriceMaterials + totalPriceWork;

        System.out.println(totalPrice);
    }
}
