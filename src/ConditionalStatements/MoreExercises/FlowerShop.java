package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numM = Integer.parseInt(scanner.nextLine());
        int numZ = Integer.parseInt(scanner.nextLine());
        int numR = Integer.parseInt(scanner.nextLine());
        int numC = Integer.parseInt(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double sumM = numM * 3.25;
        double sumZ = numZ * 4.00;
        double sumR = numR * 3.50;
        double sumC = numC * 8.00;

        double sum = 0.95 * (sumC + sumM + sumR + sumZ);

        double moneyLeft = sum - pricePresent;

        if (moneyLeft < 0) {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(Math.abs(moneyLeft)));
        } else {
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyLeft));
        }
    }
}
