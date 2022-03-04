package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        String operator = scanner.nextLine();

        double result = 0;
        String attach = "";

        switch (operator) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    attach = " - even";
                } else {
                    attach = " - odd";
                }
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    attach = " - even";
                } else {
                    attach = " - odd";
                }
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    attach = " - even";
                } else {
                    attach = " - odd";
                }
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                    return;
                } else {
                    result = (double) n1 / (double) n2;
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                    return;
                } else {
                    result = n1 % n2;
                }
                break;
        }

        if (operator.equals("/")) {
            System.out.printf("%d %s %d = %.2f%s", n1, operator, n2, result, attach);
        } else {
            System.out.printf("%d %s %d = %.0f%s", n1, operator, n2, result, attach);
        }
    }
}
