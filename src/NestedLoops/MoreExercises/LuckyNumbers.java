package NestedLoops.MoreExercises;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = Integer.parseInt(scanner.nextLine());
        int sumLeft;
        int sumRight;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 ; j++) {
                sumLeft = i + j;
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        sumRight = k + l;
                        if (sumLeft == sumRight && test % sumLeft == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
