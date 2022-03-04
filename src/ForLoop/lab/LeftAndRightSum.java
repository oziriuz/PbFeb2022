package ForLoop.lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < lines; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            leftSum += number;
        }
        for (int i = 0; i < lines; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightSum += number;
        }

        if (leftSum == rightSum){
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }
    }
}
