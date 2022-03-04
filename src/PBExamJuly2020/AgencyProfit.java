package PBExamJuly2020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String company = scanner.nextLine();
        int numOfAdultTickets = Integer.parseInt(scanner.nextLine());
        int numOfChildrenTickets = Integer.parseInt(scanner.nextLine());
        double priceAdultTicket = Double.parseDouble(scanner.nextLine());
        double priceService = Double.parseDouble(scanner.nextLine());

        double priceChildTicket = 0.30 * priceAdultTicket;

        double priceAllTickets = numOfAdultTickets * (priceAdultTicket + priceService) +
                numOfChildrenTickets * (priceChildTicket + priceService);

        double profit = 0.2 * priceAllTickets;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company, profit);
    }
}
