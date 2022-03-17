package PBExamMarch2020;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String setSize = scanner.nextLine();
        int numOfSets = Integer.parseInt(scanner.nextLine());

        double setPrice = 0;

        switch (fruit) {
            case "Watermelon":
                if (setSize.equals("small")) {
                    setPrice = 56 * 2;
                }
                if (setSize.equals("big")) {
                    setPrice = 28.70 * 5;
                }
                break;
            case "Mango":
                if (setSize.equals("small")) {
                    setPrice = 36.66 * 2;
                }
                if (setSize.equals("big")) {
                    setPrice = 19.60 * 5;
                }
                break;
            case "Pineapple":
                if (setSize.equals("small")) {
                    setPrice = 42.10 * 2;
                }
                if (setSize.equals("big")) {
                    setPrice = 24.80 * 5;
                }
                break;
            case "Raspberry":
                if (setSize.equals("small")) {
                    setPrice = 20 * 2;
                }
                if (setSize.equals("big")) {
                    setPrice = 15.20 * 5;
                }
                break;
            default:
                break;
        }
        double totalPrice = numOfSets * setPrice;

        if (totalPrice >= 400 && totalPrice <= 1000) {
            totalPrice = totalPrice * 0.85;
        } else if (totalPrice > 1000) {
            totalPrice = totalPrice / 2;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
