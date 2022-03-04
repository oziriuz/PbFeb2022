package ForLoop.MoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPackages = Integer.parseInt(scanner.nextLine());
        int tonsByBus = 0;
        int tonsByTruck = 0;
        int tonsByTrain = 0;

        for (int i = 1; i <= numOfPackages; i++) {
            int tons = Integer.parseInt(scanner.nextLine());

            if (tons < 4) {
                tonsByBus += tons;
            } else if (tons < 12) {
                tonsByTruck += tons;
            } else {
                tonsByTrain += tons;
            }
        }

        double priceByBus = tonsByBus * 200.00;
        double priceByTruck = tonsByTruck * 175.00;
        double priceByTrain = tonsByTrain * 120.00;

        double avPrice = (priceByBus + priceByTruck + priceByTrain) / (tonsByBus + tonsByTruck + tonsByTrain);
        double percentByBus = (double) tonsByBus / ((tonsByBus + tonsByTruck + tonsByTrain)) * 100;
        double percentByTruck = (double) tonsByTruck / ((tonsByBus + tonsByTruck + tonsByTrain)) * 100;
        double percentByTrain = (double) tonsByTrain / ((tonsByBus + tonsByTruck + tonsByTrain)) * 100;

        System.out.printf("%.2f%n", avPrice);
        System.out.printf("%.2f%%%n", percentByBus);
        System.out.printf("%.2f%%%n", percentByTruck);
        System.out.printf("%.2f%%%n", percentByTrain);
    }
}
