package Softuniada2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HolidayTreat {
    static int[][] printResult = new int[15][15];
    static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputSweets = new ArrayList<>();
        inputSweets.addAll(Arrays.asList(scanner.nextLine().split(", ")));
        int n = inputSweets.size();
        int k = Integer.parseInt(scanner.nextLine());
        int[] sweets = new int[n];
        boolean notPossible = false;

        for (int i = 0; i < inputSweets.size(); i++) {
            if (n <= 0) break;
            sweets[i] = Integer.parseInt(inputSweets.get(--n).trim());
        }

        if (canPartitionKSubsets(sweets, k)) {
            System.out.println();
        } else {
            System.out.println("Packaging is not possible!");
            notPossible = true;
        }
        //printing the results extracted from recursive backtracking
        if (!notPossible) {
            for (int i = 0; i < k; i++) {
                System.out.printf("Package %d is %n", i);
                for (int j = 0; j < 15; j++) {
                    if (printResult[i][j] != 0) {
                        System.out.printf("%d %n", printResult[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }

    public static boolean canPartitionKSubsets(int[] arr, int k) {
        int sumOfArrayItems = IntStream.of(arr).sum();
        if (k == 0 || sumOfArrayItems % k != 0) {
            return false;
        }
        return canPartition(0, arr, new boolean[arr.length], k, 0, sumOfArrayItems / k, k);
    }

    public static boolean canPartition(int iterationStart, int[] arr, boolean[] used,
                                       int k, int inProgressPackageSum, int targetPackageSum, int limit) {
        //packages left
        if (k == 0) {
            return true;
        }
        //finished a package and move on
        if (inProgressPackageSum == targetPackageSum) {
            return canPartition(0, arr, used, k - 1, 0, targetPackageSum, limit);
        }
        //try items
        for (int i = iterationStart; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true; //choose this and mark as used
                //try if fits
                if (canPartition(i + 1, arr, used, k, inProgressPackageSum + arr[i], targetPackageSum, limit)) {
                    // get item if fits and push it to global array by package number
                    printResult[limit - k][counter] = arr[i];
                    counter++;
                    return true;
                }
                used[i] = false; //unmark when it is not suitable
            }
        }
        return false;
    }
}