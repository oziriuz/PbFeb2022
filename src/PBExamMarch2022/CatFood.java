package PBExamMarch2022;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCats = Integer.parseInt(scanner.nextLine());
        double foodGrams;
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        double sumFood = 0;

        for (int i = 0; i < numCats; i++) {
            foodGrams = Double.parseDouble(scanner.nextLine());
            sumFood += foodGrams;
            if (foodGrams >= 100 && foodGrams < 200) {
                group1++;
            }

            if (foodGrams >= 200 && foodGrams < 300) {
                group2++;
            }

            if (foodGrams >= 300 && foodGrams < 400) {
                group3++;
            }
        }

        double price = sumFood/1000 * 12.45;

        System.out.printf("Group 1: %d cats.%n", group1);
        System.out.printf("Group 2: %d cats.%n", group2);
        System.out.printf("Group 3: %d cats.%n", group3);
        System.out.printf("Price for food per day: %.2f lv.", price);
    }
}
