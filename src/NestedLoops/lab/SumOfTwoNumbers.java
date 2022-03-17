package NestedLoops.lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int totalCombinations = 0;

        for (int i = start; i <= stop ; i++) {
            for (int j = start; j <= stop ; j++) {
                totalCombinations++;
                if (i + j == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", totalCombinations, i, j, magic);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", totalCombinations, magic);
    }
}
