package FirstStepInCoding.exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRICE_CHICKEN_MENU = 10.35;
        final double PRICE_FISH_MENU = 12.40;
        final double PRICE_VEGAN_MENU = 8.15;
        final double PRICE_DELIVERY = 2.50;

        int numberOfChickenMenus;
        int numberOfFishMenus;
        int numberOfVeganMenus;

        double priceChickenMenus;
        double priceFishMenus;
        double priceVeganMenus;
        double priceWithoutDesert;

        double priceDesert;
        double totalCheck;

        numberOfChickenMenus = Integer.parseInt(scanner.nextLine());
        numberOfFishMenus = Integer.parseInt(scanner.nextLine());
        numberOfVeganMenus = Integer.parseInt(scanner.nextLine());

        priceChickenMenus = numberOfChickenMenus * PRICE_CHICKEN_MENU;
        priceFishMenus = numberOfFishMenus * PRICE_FISH_MENU;
        priceVeganMenus = numberOfVeganMenus * PRICE_VEGAN_MENU;
        priceWithoutDesert = priceChickenMenus + priceFishMenus + priceVeganMenus;
        priceDesert = priceWithoutDesert * 0.20;
        totalCheck = priceWithoutDesert + priceDesert + PRICE_DELIVERY;

        System.out.println(totalCheck);
    }
}
