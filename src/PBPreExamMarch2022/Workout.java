package PBPreExamMarch2022;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double kmFirstDay = Double.parseDouble(scanner.nextLine());
        double kmTarget = 1000.0;
        double kmSum = kmFirstDay;
        double kmDaily = kmFirstDay;

        for (int i = 1; i <= days; i++) {
            int percent = Integer.parseInt(scanner.nextLine());

            kmDaily += kmDaily * percent / 100;
            kmSum += kmDaily;
        }

        if (kmSum >= kmTarget) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(kmSum - kmTarget));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(kmTarget - kmSum));
        }
    }
}
