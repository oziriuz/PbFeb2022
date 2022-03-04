package PBExamMarch2020;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodLeft = Integer.parseInt(scanner.nextLine());
        foodLeft = foodLeft * 1000;
        String grams = scanner.nextLine();

        while (!grams.equals("Adopted")) {
            foodLeft -= Integer.parseInt(grams);
            grams = scanner.nextLine();
        }

        if (foodLeft >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodLeft);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodLeft));
        }
    }
}
