package PBExamMarch2020;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0;

        switch (sport) {
            case "Gym":
                if(gender == 'm') {
                    price = 42;
                }
                if(gender == 'f') {
                    price = 35;
                }
                break;
            case "Boxing":
                if(gender == 'm') {
                    price = 41;
                }
                if(gender == 'f') {
                    price = 37;
                }
                break;
            case "Yoga":
                if(gender == 'm') {
                    price = 45;
                }
                if(gender == 'f') {
                    price = 42;
                }
                break;
            case "Zumba":
                if(gender == 'm') {
                    price = 34;
                }
                if(gender == 'f') {
                    price = 31;
                }
                break;
            case "Dances":
                if(gender == 'm') {
                    price = 51;
                }
                if(gender == 'f') {
                    price = 53;
                }
                break;
            case "Pilates":
                if(gender == 'm') {
                    price = 39;
                }
                if(gender == 'f') {
                    price = 37;
                }
                break;
            default:
                break;
        }

        if (age < 20) {
            price = price * 0.80;
        }
        if (budget >= price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - budget);
        }
    }
}
