package FirstStepInCoding.exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesPerBook;
        int pagesPerHour;
        int daysForReading;

        int hoursPerBook;
        int hoursPerDay;

        pagesPerBook = Integer.parseInt(scanner.nextLine());
        pagesPerHour = Integer.parseInt(scanner.nextLine());
        daysForReading = Integer.parseInt(scanner.nextLine());

        hoursPerBook = pagesPerBook / pagesPerHour;
        hoursPerDay = hoursPerBook / daysForReading;

        System.out.println(hoursPerDay);
    }
}
