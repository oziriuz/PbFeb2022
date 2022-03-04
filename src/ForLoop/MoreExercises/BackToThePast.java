package ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        double moneyNeeded = 0;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                moneyNeeded += 12_000;
            } else {
                moneyNeeded += 12_000 + (50 * (18 + i - 1800));
            }
        }

        double moneyLeft = money - moneyNeeded;

        if (moneyLeft < 0) {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyLeft));
        } else {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyLeft);
        }
    }
}
