package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int fuelLitres = Integer.parseInt(scanner.nextLine());

        if(!fuelType.equals("Diesel") && !fuelType.equals("Gasoline") && !fuelType.equals("Gas")) {
            System.out.println("Invalid fuel!");
            return;
        }

        if (fuelLitres >= 25) {
            System.out.printf("You have enough %s.", fuelType.toLowerCase());
        } else {
            System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
        }
    }
}
