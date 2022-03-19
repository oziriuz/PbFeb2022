package NestedLoops.MoreExercises;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstLimit = Integer.parseInt(scanner.nextLine());
        int secondLimit = Integer.parseInt(scanner.nextLine());
        int thirdLimit = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;
        int first;
        int mid = 0;
        int last;

        for (int i = 2; i <= firstLimit; i += 2) {
            first = i;
            for (int j = 2; j <= secondLimit; j++) {
                for (int k = 2; k < j; k++) {
                    if (j % k == 0) {
                        isPrime = false;
                        break;
                    }
                    mid = j;
                }
                if (j==2) {
                    mid = j;
                }

                if (!isPrime) {
                    isPrime = true;
                    continue;
                }
                for (int k = 2; k <= thirdLimit; k+=2) {
                    last = k;
                    System.out.printf("%d %d %d%n", first, mid, last);
                }
            }
        }
    }
}
