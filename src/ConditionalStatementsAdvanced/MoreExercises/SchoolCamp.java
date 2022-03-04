package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        int numOfStudents = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;
        String sport = null;
        nights = nights * numOfStudents;

        switch (season) {
            case "Winter":
                if (typeGroup.equals("mixed")) {
                    price = nights * 10.00;
                    sport = "Ski";
                } else {
                    if (typeGroup.equals("boys")) {
                        sport = "Judo";
                    }
                    if (typeGroup.equals("girls")) {
                        sport = "Gymnastics";
                    }
                    price = nights * 9.60;
                }
                break;
            case "Spring":
                if (typeGroup.equals("mixed")) {
                    price = nights * 9.50;
                    sport = "Cycling";
                } else {
                    if (typeGroup.equals("boys")) {
                        sport = "Tennis";
                    }
                    if (typeGroup.equals("girls")) {
                        sport = "Athletics";
                    }
                    price = nights * 7.20;
                }
                break;
            case "Summer":
                if (typeGroup.equals("mixed")) {
                    price = nights * 20.00;
                    sport = "Swimming";
                } else {
                    if (typeGroup.equals("boys")) {
                        sport = "Football";
                    }
                    if (typeGroup.equals("girls")) {
                        sport = "Volleyball";
                    }
                    price = nights * 15.00;
                }
                break;
            default:
                break;
        }

        if (numOfStudents >= 10 && numOfStudents < 20) {
            price = 0.95 * price;
        } else if (numOfStudents >= 20 && numOfStudents < 50) {
            price = 0.85 * price;
        } else if (numOfStudents >= 50) {
            price = 0.50 * price;
        }

        System.out.printf("%s %.2f lv.", sport, price);
    }
}
