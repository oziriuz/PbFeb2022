package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;

        while (true) {
            number = Double.parseDouble(scanner.nextLine());
            if (number < 0) {
                break;
            }
            System.out.printf("Result: %.2f %n", number * 2);
        }
        System.out.println("Negative number!");
    }
}
