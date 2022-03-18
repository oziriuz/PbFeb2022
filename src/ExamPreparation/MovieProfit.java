package ExamPreparation;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int ticketsPerDay = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentInput = Integer.parseInt(scanner.nextLine());
        double percent = percentInput/100.0;

        double sum = days * ticketsPerDay  * ticketPrice;
        sum = sum * (1-percent);

        System.out.printf("The profit from the movie %s is %.2f lv.", movie, sum);
    }
}
