package ExamPreparation;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int counter = 0;
        double totalPrice = 0;

        while (!command.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            counter++;
            if (counter %3 ==0) {
                price = price * 0.5;
            }

            budget -= price;
            totalPrice += price;

            if (budget < 0) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", Math.abs(budget));
                return;
            }
            command = scanner.nextLine();
        }

        System.out.printf("You bought %d products for %.2f leva.", counter, totalPrice);
    }
}
