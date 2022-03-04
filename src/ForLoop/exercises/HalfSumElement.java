package ForLoop.exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < lines; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i == 0) {
                max = number;
            }
            max = Math.max(max, number);
            sum += number;
        }
        if (sum - max == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sum - 2 * max));
        }
    }
}
