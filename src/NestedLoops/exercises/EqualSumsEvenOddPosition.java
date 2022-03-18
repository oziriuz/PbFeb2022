package NestedLoops.exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= stop; i++) {
            int number = i;
            int sumEven = 0;
            int sumOdd = 0;
            for (int j = 6; j >= 1; j--) {
                int current = number % 10;
                number = number / 10;
                if (j % 2 == 0) {
                    sumEven += current;
                } else {
                    sumOdd += current;
                }
            }
            if (sumEven == sumOdd) {
                System.out.printf("%d ", i);
            }
        }
    }
}
