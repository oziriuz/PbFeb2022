package PBExamMarch2022;

import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double avH = Double.parseDouble(scanner.nextLine());

        double volShip = width * length * height;

        double volRoom = 2 * 2 * (avH + 0.40);

        double result = Math.floor(volShip / volRoom);

        if (result >= 3 && result <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", result);
        } else if (result < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (result > 10) {
            System.out.println("The spacecraft is too big.");
        }
    }
}
