package ForLoop.lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < lines; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        if (sumEven == sumOdd){
            System.out.println("Yes");
            System.out.println("Sum = " + sumEven);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumEven - sumOdd));
        }
    }
}
