package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String period = scanner.nextLine();

        double priceTaxi = Integer.MAX_VALUE;
        if (period.equals("day")) {
            priceTaxi = 0.70 + 0.79 * km;
        }
        if (period.equals("night")) {
            priceTaxi = 0.70 + 0.90 * km;
        }

        double priceBus = Integer.MAX_VALUE;
        if (km >= 20) {
            priceBus = km * 0.09;
        }

        double priceTrain = Integer.MAX_VALUE;
        if (km >= 100) {
            priceTrain = km * 0.06;
        }

        double minPrice = Math.min(priceTaxi, priceBus);
        minPrice = Math.min(minPrice, priceTrain);

        System.out.printf("%.2f", minPrice);
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.

    }
}
