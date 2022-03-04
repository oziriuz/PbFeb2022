package ConditionalStatements.exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSeries = scanner.nextLine();
        int lengthSeries = Integer.parseInt(scanner.nextLine());
        int lengthBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = lengthBreak / 8.0;
        double restingTime = lengthBreak / 4.0;

        double timeLeft = lengthBreak - lunchTime - restingTime - lengthSeries;

        if (timeLeft < 0) {
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.",
                    nameSeries, (int) Math.ceil(Math.abs(timeLeft)));
        } else {
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.",
                    nameSeries, (int) Math.ceil(Math.abs(timeLeft)));
        }
    }
}
