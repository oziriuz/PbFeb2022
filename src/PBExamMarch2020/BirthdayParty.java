package PBExamMarch2020;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hallRent = Double.parseDouble(scanner.nextLine());

        double priceCake = hallRent * 0.20;
        double priceBeverages = 0.55 * priceCake;
        double priceAnim = hallRent / 3;

        double budgetNeeded = hallRent + priceAnim + priceBeverages + priceCake;

        System.out.println(budgetNeeded);
    }
}
