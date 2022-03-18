package NestedLoops.exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecial = true;

        for (int i = 1111; i <= 9999; i++) {
            int testNumber = i;
            for (int j = 0; j < 4; j++) {
                int figure = testNumber % 10;
                testNumber = testNumber / 10;
                if (figure == 0) {
                    isSpecial = false;
                    break;
                }
                if (n % figure != 0) {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                System.out.printf("%d ", i);
            }
            isSpecial = true;
        }
    }
}
