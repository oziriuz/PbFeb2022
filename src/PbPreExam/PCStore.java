package PbPreExam;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceCPU = Double.parseDouble(scanner.nextLine());
        double priceGraphics = Double.parseDouble(scanner.nextLine());
        double priceRam = Double.parseDouble(scanner.nextLine());
        int numberOfRams = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double sumLeva = priceCPU * 1.57 * (1 - percent) + priceGraphics * 1.57 * (1 - percent) + priceRam * numberOfRams * 1.57;
        System.out.printf("Money needed - %.2f leva.", sumLeva);
    }
}
