package ConditionalStatements.exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePuzzle = 2.60;
        double priceDoll = 3.00;
        double priceBear = 4.10;
        double priceMinion = 8.20;
        double priceTruck = 2.00;

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int numPuzzles = Integer.parseInt(scanner.nextLine());
        int numDolls = Integer.parseInt(scanner.nextLine());
        int numBears = Integer.parseInt(scanner.nextLine());
        int numMinions = Integer.parseInt(scanner.nextLine());
        int numTrucks = Integer.parseInt(scanner.nextLine());

        double totalPrice = pricePuzzle*numPuzzles + priceDoll*numDolls + priceBear*numBears + priceMinion*numMinions + priceTruck*numTrucks;

        int numOfToys = numPuzzles+numDolls+numBears+numMinions+numTrucks;

        if (numOfToys >= 50) {
            totalPrice = totalPrice * 0.75;
        }

        totalPrice = totalPrice * 0.9;

        double rest = totalPrice - vacationPrice;

        if (rest >= 0) {
            System.out.printf("Yes! %.2f lv left.", rest);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(rest));
        }
    }
}
