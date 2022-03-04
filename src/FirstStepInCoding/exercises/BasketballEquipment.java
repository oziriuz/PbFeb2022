package FirstStepInCoding.exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearPaymentForTraining;

        yearPaymentForTraining = Integer.parseInt(scanner.nextLine());

        double basketballShoes = yearPaymentForTraining * 0.6;
        double basketballSuit = basketballShoes * 0.8;
        double basketballBall = basketballSuit / 4;
        double basketballAccessories = basketballBall / 5;
        double totalPrice = yearPaymentForTraining + basketballShoes + basketballSuit + basketballBall + basketballAccessories;

        System.out.println(totalPrice);
    }
}
