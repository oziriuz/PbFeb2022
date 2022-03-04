package ForLoop.exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int numOfJury = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfJury; i++) {
            String nameJury = scanner.nextLine();
            double pointsTemp = Double.parseDouble(scanner.nextLine());

            points += nameJury.length() * pointsTemp / 2;

            if (points >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, points);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - points);
    }
}
