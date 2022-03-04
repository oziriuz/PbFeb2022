package PBExamJuly2020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceLuggage = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int dayLeftToTakeOff = Integer.parseInt(scanner.nextLine());
        int numOfPacks = Integer.parseInt(scanner.nextLine());

        if (luggageKg < 10) {
            priceLuggage = 0.2 * priceLuggage;
        } else if (luggageKg <= 20) {
            priceLuggage = 0.5 * priceLuggage;
        }

        if (dayLeftToTakeOff < 7) {
            priceLuggage = priceLuggage * 1.4;
        } else if (dayLeftToTakeOff <= 30) {
            priceLuggage = priceLuggage * 1.15;
        } else {
            priceLuggage = priceLuggage * 1.1;
        }

        double totalCost = numOfPacks * priceLuggage;

        System.out.printf(" The total price of bags is: %.2f lv. ", totalCost);
    }
}
