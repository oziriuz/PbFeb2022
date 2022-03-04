package FirstStepInCoding.exercises;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usdPriceBgn = 1.79549;
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usdPriceBgn * usd;

        System.out.println(bgn);
    }
}
