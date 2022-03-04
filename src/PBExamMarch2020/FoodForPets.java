package PBExamMarch2020;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double sumFood = Double.parseDouble(scanner.nextLine());
        double sumFoodByDog = 0;
        double sumFoodByCat = 0;
        double sumBiscuits = 0;

        for (int i = 1; i <= days; i++) {
            int foodEatenByDog = Integer.parseInt(scanner.nextLine());
            int foodEatenByCat = Integer.parseInt(scanner.nextLine());

            sumFoodByCat += foodEatenByCat;
            sumFoodByDog += foodEatenByDog;

            if (i % 3 ==0) {
                sumBiscuits += (foodEatenByCat + foodEatenByDog) * 0.1;
            }
        }

        double sumEatenFood = sumFoodByCat + sumFoodByDog;

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(sumBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", sumEatenFood / sumFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", sumFoodByDog / sumEatenFood * 100);
        System.out.printf("%.2f%% eaten from the cat.", sumFoodByCat / sumEatenFood * 100);
    }
}
