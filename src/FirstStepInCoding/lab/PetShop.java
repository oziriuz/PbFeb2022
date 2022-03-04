package FirstStepInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double singlePriceDogFood = 2.50;
        double singlePriceCatFood = 4.00;
        int numberOfDogFoodPacks;
        int numberOfCatFoodPacks;
        double totalDogFoodPrice;
        double totalCatFoodPrice;
        double totalPetFoodPrice;

        numberOfDogFoodPacks = Integer.parseInt(scanner.nextLine());
        numberOfCatFoodPacks = Integer.parseInt(scanner.nextLine());

        if (numberOfDogFoodPacks >= 0 && numberOfDogFoodPacks <= 100) {
            totalDogFoodPrice = singlePriceDogFood * numberOfDogFoodPacks;
            if (numberOfCatFoodPacks >= 0 && numberOfCatFoodPacks <= 100) {
                totalCatFoodPrice = singlePriceCatFood * numberOfCatFoodPacks;
                totalPetFoodPrice = totalDogFoodPrice + totalCatFoodPrice;
                System.out.println(totalPetFoodPrice + " lv.");
            } else {
                System.out.println("Cat food packs must be between 0 and 100!");
            }
        }
            else {
                System.out.println("Dog food packs must be between 0 and 100!");
            }
    }
}
