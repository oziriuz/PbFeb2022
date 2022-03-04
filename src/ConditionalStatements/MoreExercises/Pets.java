package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double foodKg = Double.parseDouble(scanner.nextLine()); //in kg
        double foodForDogPerDay = Double.parseDouble(scanner.nextLine()); //in kg
        double foodForCatPerDay = Double.parseDouble(scanner.nextLine()); //in kg
        double foodForTortoisePerDay = Double.parseDouble(scanner.nextLine()); //in grams

        foodForTortoisePerDay = foodForTortoisePerDay / 1000; //to kg

        double totalFoodNeeded = days * (foodForDogPerDay + foodForCatPerDay + foodForTortoisePerDay);

        double foodLeft = foodKg - totalFoodNeeded;

        if (foodLeft < 0) {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(Math.abs(foodLeft)));
        } else {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft));
        }
    }
}
