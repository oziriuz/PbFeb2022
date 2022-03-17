package WhileLoop.exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double moneyBalance = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int spendCounter = 0;

        while (moneyBalance < neededMoney && spendCounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCounter++;
            if (command.equals("save")) {
                moneyBalance += money;
                spendCounter = 0;
            } else if (command.equals("spend")) {
                moneyBalance -= money;
                spendCounter++;
                if (moneyBalance < 0) {
                    moneyBalance = 0;
                }
            }
        }
        if (spendCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }
        if (moneyBalance >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}
