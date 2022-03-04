package ForLoop.exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int agesLilly = Integer.parseInt(scanner.nextLine());
        double priceWashing = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int numberOfToys = 0;
        int money = 0;

        for (int i = 1; i <= agesLilly; i += 2) {
            numberOfToys++;
        }
        for (int i = 2; i <= agesLilly; i += 2) {
            money += i/2 * 10 - 1;
        }

        money += priceToy * numberOfToys;

        double diff = money - priceWashing;

        if (diff < 0) {
            System.out.printf("No! %.2f", Math.abs(diff));
        } else {
            System.out.printf("Yes! %.2f", diff);
        }
    }
}
