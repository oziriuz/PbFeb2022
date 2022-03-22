package PbPreExam;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceParty = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keyHolders = Integer.parseInt(scanner.nextLine());
        int pictures = Integer.parseInt(scanner.nextLine());
        int surprises = Integer.parseInt(scanner.nextLine());

        int sumArticles = loveLetters + roses + keyHolders + pictures + surprises;

        double sumMoney = loveLetters * 0.60 + roses * 7.20 + keyHolders * 3.60 + pictures * 18.20 + surprises * 22.0;

        if (sumArticles >= 25) {
            sumMoney = sumMoney * 0.65;
        }

        sumMoney = sumMoney * 0.90;

        if (priceParty <= sumMoney) {
            System.out.printf("Yes! %.2f lv left.", sumMoney - priceParty);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceParty - sumMoney);
        }

    }
}
