package ForLoop.lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int result = 0;

        for (int i = 0; i < lines; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            result += number;
        }
        System.out.println(result);
    }
}
