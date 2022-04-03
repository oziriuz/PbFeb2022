package PBExamMarch2022;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLocations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLocations; i++) {
            double estimateGoldPerDay = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double sumGoldForLocation = 0;
            for (int j = 0; j < days; j++) {
                double goldForToday = Double.parseDouble(scanner.nextLine());
                sumGoldForLocation += goldForToday;
            }
            double avGoldReal = sumGoldForLocation / days;
            if  (avGoldReal >= estimateGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", avGoldReal);
            } else {
                double moreNeeded = estimateGoldPerDay - avGoldReal;
                System.out.printf("You need %.2f gold.%n", moreNeeded);
            }
        }
    }
}
