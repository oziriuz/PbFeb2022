package PBExamMarch2020;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double uans = Double.parseDouble(scanner.nextLine());
        double perCom = Double.parseDouble(scanner.nextLine());

        double sumInBGN = bitcoins * 1168 + (uans * 0.15) * 1.76;
        double sumInEuro = sumInBGN / 1.95;

        //commision
        sumInEuro = sumInEuro * (1 - perCom/100);

        System.out.printf("%.2f", sumInEuro);
    }
}
