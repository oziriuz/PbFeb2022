package NestedLoops.lab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                for (int k = 0; k <= number ; k++) {
                    if (i + j + k == number) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
