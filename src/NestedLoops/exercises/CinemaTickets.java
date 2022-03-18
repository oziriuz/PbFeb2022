package NestedLoops.exercises;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int totalTickets = 0;
        int counterStudent = 0;
        int counterStandard = 0;
        int counterKid = 0;

        while (!command.equals("Finish")) {
            double freePlaces = Double.parseDouble(scanner.nextLine());
            int counterPlaces = 0;
            for (int i = 0; i < freePlaces; i++) {
                String type = scanner.nextLine();
                if (type.equals("End")) {
                    break;
                }
                counterPlaces++;
                switch (type) {
                    case "student":
                        counterStudent++;
                        break;
                    case "standard":
                        counterStandard++;
                        break;
                    case "kid":
                        counterKid++;
                        break;
                    default:
                        break;
                }
            }
            System.out.printf("%s - %.2f%% full.%n", command, 100 * counterPlaces/freePlaces);
            totalTickets += counterPlaces;
            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", 100.00 * counterStudent/totalTickets);
        System.out.printf("%.2f%% standard tickets.%n", 100.00 * counterStandard/totalTickets);
        System.out.printf("%.2f%% kids tickets.%n", 100.00 * counterKid/totalTickets);
    }
}
