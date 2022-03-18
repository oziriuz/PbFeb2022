package ExamPreparation;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //За всеки четен ден и нечетен час, паркингът таксува 2.50 лева.
        // Във всеки нечетен ден и четен час таксата е 1.25 лева, във всички останали случаи се заплаща 1 лев.
        // Таксуването става на всеки изминал час от деня.
        // Всеки един от изходите трябва да бъде закръглен до втория знак след десетичната запетая.

        int days = Integer.parseInt(scanner.nextLine());
        int hourPerDay = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;


        for (int i = 1; i <= days; i++) {
            double daySum = 0;

            for (int j = 1; j <= hourPerDay; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    daySum += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    daySum += 1.25;
                } else {
                    daySum += 1;
                }
            }
            totalSum += daySum;
            System.out.printf("Day: %d - %.2f leva%n", i, daySum);
        }
        System.out.printf("Total: %.2f leva%n", totalSum);
    }
}
