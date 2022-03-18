package WhileLoop.MoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSum = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int counter = 0;
        int counterCash = 0;
        int counterCard = 0;
        double sumCash = 0;
        double sumCard = 0;

        while (!command.equals("End")) {
            int input = Integer.parseInt(command);
            counter++;
            if (counter % 2 != 0) {
                //cash
                if (input > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    targetSum -= input;
                    counterCash++;
                    sumCash += input;
                }
            } else {
                //card
                if (input < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    targetSum -= input;
                    counterCard++;
                    sumCard += input;
                }
            }

            if (targetSum <= 0) {
                double averageCash = 0;
                double averageCard = 0;
                if (counterCash > 0) {
                    averageCash = sumCash / counterCash;
                }
                if (counterCard > 0) {
                    averageCard = sumCard / counterCard;
                }
                System.out.printf("Average CS: %.2f%n", averageCash);
                System.out.printf("Average CC: %.2f", averageCard);
                return;
            }
            command = scanner.nextLine();
        }
        System.out.println("Failed to collect required money for charity.");

    }
}
