package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJuniors = Integer.parseInt(scanner.nextLine());
        int numSeniors = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        double totalSum = 0;

        switch (type) {
            case "trail":
                totalSum = 0.95 * (numJuniors * 5.50 + numSeniors * 7.00);
                break;
            case "cross-country":
                if (numJuniors + numSeniors >= 50) {
                    totalSum = 0.95 * (numJuniors * 8.00 + numSeniors * 9.50) * 0.75;
                } else {
                    totalSum = 0.95 * (numJuniors * 8.00 + numSeniors * 9.50);
                }
                break;
            case "downhill":
                totalSum = 0.95 * (numJuniors * 12.25 + numSeniors * 13.75);
                break;
            case "road":
                totalSum = 0.95 * (numJuniors * 20.00 + numSeniors * 21.50);
                break;
            default:
                break;
        }

        System.out.printf("%.2f", totalSum);
    }
}
