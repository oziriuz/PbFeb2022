package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        int kmPerMonth = Integer.parseInt(scanner.nextLine());
        double salary = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kmPerMonth <= 5_000) {
                    salary = 0.90 * (4 * kmPerMonth * 0.75);
                } else if (kmPerMonth <= 10_000) {
                    salary = 0.90 * (4 * kmPerMonth * 0.95);
                }
                break;
            case "Summer":
                if (kmPerMonth <= 5_000) {
                    salary = 0.90 * (4 * kmPerMonth * 0.90);
                } else if (kmPerMonth <= 10_000) {
                    salary = 0.90 * (4 * kmPerMonth * 1.10);
                }
                break;
            case "Winter":
                if (kmPerMonth <= 5_000) {
                    salary = 0.90 * (4 * kmPerMonth * 1.05);
                } else if (kmPerMonth <= 10_000) {
                    salary = 0.90 * (4 * kmPerMonth * 1.25);
                }
                break;
            default:
                break;
        }

        if (kmPerMonth > 10_000 && kmPerMonth <= 20_000) {
            salary = 0.90 * (4 * kmPerMonth * 1.45);
        }

        System.out.printf("%.2f", salary);
    }
}
