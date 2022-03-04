package FirstStepInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double singlePrice = 7.61;
        double discount;
        double squareMeters;
        double totalPrice;
        double totalPriceWithDiscount;

        squareMeters = Double.parseDouble(scanner.nextLine());
        if (squareMeters >= 0 && squareMeters <= 10000) {
            totalPrice = singlePrice * squareMeters;
            discount = totalPrice * 0.18;
            totalPriceWithDiscount = totalPrice - discount;
            System.out.println("The final price is: " + totalPriceWithDiscount + " lv.");
            System.out.println("The discount is: " + discount + " lv.");
        }
        else {
            System.out.println("Square meters must be between 0 and 10000!");
        }
    }
}
