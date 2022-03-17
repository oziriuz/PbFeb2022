package WhileLoop.lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;
        int number;

        while (!input.equals("Stop")) {
            number = Integer.parseInt(input);
            minNumber = Math.min(minNumber, number);
            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
