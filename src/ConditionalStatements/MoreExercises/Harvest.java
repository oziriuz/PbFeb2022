package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int areaWineyard = Integer.parseInt(scanner.nextLine());
        double grapesPerSqm = Double.parseDouble(scanner.nextLine());
        int litresWineForSale = Integer.parseInt(scanner.nextLine());
        int numOfWorkers = Integer.parseInt(scanner.nextLine());

        double grapesForWine = areaWineyard * grapesPerSqm * 0.40; // 40% for wine
        double litresWineMade = grapesForWine / 2.5; //2.5 kg for 1 litre
        double litresWineLeft = litresWineMade - litresWineForSale; // litres for sale

        if (litresWineLeft < 0) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(Math.abs(litresWineLeft)));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(litresWineMade));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(litresWineLeft), Math.ceil(litresWineLeft / numOfWorkers));
        }
    }
}
