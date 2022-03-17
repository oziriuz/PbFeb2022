package WhileLoop.lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;
        int number;

        while (!input.equals("Stop")) {
            number = Integer.parseInt(input);
            maxNumber = Math.max(maxNumber, number);
            input = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
