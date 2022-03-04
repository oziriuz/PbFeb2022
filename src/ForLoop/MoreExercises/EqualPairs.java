package ForLoop.MoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairs = Integer.parseInt(scanner.nextLine());
        int maxDiff = Integer.MIN_VALUE;
        int diff = 0;
        int sum = 0;

        for (int i = 0; i < pairs; i++) {
            int numA = Integer.parseInt(scanner.nextLine());
            int numB = Integer.parseInt(scanner.nextLine());
            if (i > 0) {
                diff = Math.abs((numA + numB) - sum);
            }
            maxDiff = Math.max(maxDiff, diff);
            sum = numA + numB;

        }
        if (maxDiff == 0) {
            System.out.printf("Yes, value=%d", sum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
