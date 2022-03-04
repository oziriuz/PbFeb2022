package ConditionalStatements.lab;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberA = Integer.parseInt(scanner.nextLine());
        int numberB = Integer.parseInt(scanner.nextLine());

        if (numberA >= numberB) {
            System.out.println(numberA);
        } else {
            System.out.println(numberB);
        }
    }
}
