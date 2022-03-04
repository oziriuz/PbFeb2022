package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int fuelLitres = Integer.parseInt(scanner.nextLine());
        String haveCard = scanner.nextLine();

        double priceGas = 0.93;
        double priceGasoline = 2.22;
        double priceDiesel = 2.33;

        if (haveCard.equals("Yes")) {
            priceGas = 0.93 - 0.08;
            priceGasoline = 2.22 - 0.18;
            priceDiesel = 2.33 - 0.12;
        }
        double cost = 0;
        switch (fuelType) {
            case "Gas":
                cost = fuelLitres * priceGas;
                break;
            case "Gasoline":
                cost = fuelLitres * priceGasoline;
                break;
            case "Diesel":
                cost = fuelLitres * priceDiesel;
                break;
            default:
                break;
        }
        if (fuelLitres >= 20 && fuelLitres <= 25) {
            cost = cost * 0.92;
        } else if (fuelLitres > 25) {
            cost = cost * .90;
        }
        System.out.printf("%.2f lv.", cost);
    }
}
