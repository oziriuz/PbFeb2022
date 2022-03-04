package ConditionalStatements.exercises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus;

        if (number <= 100) {
            bonus = 5;
        } else if (number <= 1000) {
            bonus = 0.2 * number;
        } else {
            bonus = 0.1 * number;
        }


        if (number % 2 == 0) {
            bonus++;
        } else if (number % 5 == 0) {
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}
