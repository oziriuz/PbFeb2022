package ExamPreparation;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        if (nights > 7) {
            pricePerNight = pricePerNight * 0.95;
        }

        double sum = nights * pricePerNight + budget * percent / 100;

        double result = budget - sum;

        if (result >= 0) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", result);
        } else {
            System.out.printf("%.2f leva needed.", Math.abs(result));
        }
    }
}
