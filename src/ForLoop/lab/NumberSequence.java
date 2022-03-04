package ForLoop.lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int resultMax = 0;
        int resultMin = 0;


        for (int i = 0; i < lines; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i == 0) {
                resultMax = number;
                resultMin = number;
            }
            resultMax = Math.max(resultMax, number);
            resultMin = Math.min(resultMin, number);
        }
        System.out.println("Max number: " + resultMax);
        System.out.println("Min number: " + resultMin);
    }
}
