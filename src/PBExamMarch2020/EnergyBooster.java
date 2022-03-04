package PBExamMarch2020;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //2.	Размерът на сета - текст с възможности: "small" или "big"
        //3.	Брой на поръчаните сетове - цяло число в интервала [1 … 10000]

        String fruit = scanner.nextLine();
        String setSize = scanner.nextLine();
        int numOfSets = Integer.parseInt(scanner.nextLine());

        //	                Диня 	        Манго	        Ананас	        Малина
        //2 броя (small)	56 лв./бр.	    36.66 лв./бр.	42.10 лв./бр.	20 лв./бр.
        //5 броя (big)	    28.70 лв./бр.	19.60 лв./бр.	24.80 лв./бр.	15.20 лв./бр.

        double setPrice = 0;

        switch (fruit) {
            case "Watermelon":
                if (setSize.equals("small")) {
                    setPrice = 56 * 2;
                }
                if (setSize.equals("big")) {
                    setPrice = 28.70 * 5;
                }
                break;
            case "Mango":
                if (setSize.equals("small")) {
                    setPrice = 36.66 * 2;
                }
                if (setSize.equals("big")) {
                    setPrice = 19.60 * 5;
                }
                break;
            case "Pineapple":
                if (setSize.equals("small")) {
                    setPrice = 42.10 * 2;
                }
                if (setSize.equals("big")) {
                    setPrice = 24.80 * 5;
                }
                break;
            case "Raspberry":
                if (setSize.equals("small")) {
                    setPrice = 20 * 2;
                }
                if (setSize.equals("big")) {
                    setPrice = 15.20 * 5;
                }
                break;
            default:
                break;
        }
        double totalPrice = numOfSets * setPrice;

        if (totalPrice >= 400 && totalPrice <= 1000) {
            totalPrice = totalPrice * 0.85;
        } else if (totalPrice > 1000) {
            totalPrice = totalPrice / 2;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
