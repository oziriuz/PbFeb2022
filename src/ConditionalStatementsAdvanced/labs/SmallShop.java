package ConditionalStatementsAdvanced.labs;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //град / продукт	coffee	water	beer	sweets	peanuts
        //Sofia	            0.50	0.80	1.20	1.45	1.60
        //Plovdiv	        0.40	0.70	1.15	1.30	1.50
        //Varna	            0.45	0.70	1.10	1.35	1.55

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (town.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    price = 0.50;
                    break;
                case "water":
                    price = 0.80;
                    break;
                case "beer":
                    price = 1.20;
                    break;
                case "sweets":
                    price = 1.45;
                    break;
                case "peanuts":
                    price = 1.60;
                    break;
            }
        }

        if (town.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    price = 0.40;
                    break;
                case "water":
                    price = 0.70;
                    break;
                case "beer":
                    price = 1.15;
                    break;
                case "sweets":
                    price = 1.30;
                    break;
                case "peanuts":
                    price = 1.50;
                    break;
            }
        }

        if (town.equals("Varna")) {
            switch (product) {
                case "coffee":
                    price = 0.45;
                    break;
                case "water":
                    price = 0.70;
                    break;
                case "beer":
                    price = 1.10;
                    break;
                case "sweets":
                    price = 1.35;
                    break;
                case "peanuts":
                    price = 1.55;
                    break;
            }
        }

        double result = price*quantity;
        System.out.println(result);
    }
}
