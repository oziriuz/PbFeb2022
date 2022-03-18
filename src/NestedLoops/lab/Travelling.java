package NestedLoops.lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            double target = Double.parseDouble(scanner.nextLine());
            double money;
            double sumMoney = 0;
            while (sumMoney < target) {
                money = Double.parseDouble(scanner.nextLine());
                sumMoney += money;
            }
            System.out.printf("Going to %s!%n", command);
            command = scanner.nextLine();
        }
    }
}
