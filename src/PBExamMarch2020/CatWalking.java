package PBExamMarch2020;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int numOfWalks = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerMinute = 5;

        int caloriesWalk = minutesWalk * caloriesPerMinute * numOfWalks;

        if (caloriesWalk >= caloriesPerDay / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesWalk);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesWalk);
        }
    }
}
