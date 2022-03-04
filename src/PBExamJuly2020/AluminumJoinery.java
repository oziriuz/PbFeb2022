package PBExamJuly2020;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numWindows = Integer.parseInt(scanner.nextLine().trim());
        String sizeWindow = scanner.nextLine();
        String delivery = scanner.nextLine();
        double singlePrice = 0;


        if (numWindows < 10) {
            System.out.println("Invalid order");
            return;
        }

        switch (sizeWindow) {
            case "90X130":
                if (numWindows < 30) {
                    singlePrice = 110;
                } else if (numWindows < 60) {
                    singlePrice = 110 * 0.95;
                } else {
                    singlePrice = 110 * 0.92;
                }
                break;
            case "100X150":
                if (numWindows < 40) {
                    singlePrice = 140;
                } else if (numWindows < 80) {
                    singlePrice = 140 * 0.94;
                } else {
                    singlePrice = 140 * 0.90;
                }
                break;
            case "130X180":
                if (numWindows < 20) {
                    singlePrice = 190;
                } else if (numWindows < 50) {
                    singlePrice = 190 * 0.93;
                } else {
                    singlePrice = 190 * 0.88;
                }
                break;
            case "200X300":
                if (numWindows < 25) {
                    singlePrice = 250;
                } else if (numWindows < 50) {
                    singlePrice = 250 * 0.91;
                } else {
                    singlePrice = 250 * 0.86;
                }
                break;
            default:
                break;
        }

        double totalCost = numWindows * singlePrice;

        if (delivery.equals("With delivery")) {
            totalCost += 60;
        }

        if (numWindows > 99) {
            totalCost = totalCost * 0.96;
        }

        System.out.printf("%.2f BGN", totalCost);
    }
}
