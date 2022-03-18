package ConditionalStatementsAdvanced.labs;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commission;

        //Град	0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
        //Sofia	    5%	            7%	            8%	        12%
        //Varna	    4.5%	        7.5%	        10%	        13%
        //Plovdiv	5.5%	        8%	            12%	        14.5%


        if (sales >= 0 && sales <= 500) {
            switch (town) {
                case "Sofia":
                    commission = 0.05;
                    break;
                case "Varna":
                    commission = 0.045;
                    break;
                case "Plovdiv":
                    commission = 0.055;
                    break;
                default:
                    commission = -1;
                    break;
            }
        } else if (sales >= 0 && sales <= 1000) {
            switch (town) {
                case "Sofia":
                    commission = 0.07;
                    break;
                case "Varna":
                    commission = 0.075;
                    break;
                case "Plovdiv":
                    commission = 0.08;
                    break;
                default:
                    commission = -1;
                    break;
            }
        } else if (sales >= 0 && sales <= 10000) {
            switch (town) {
                case "Sofia":
                    commission = 0.08;
                    break;
                case "Varna":
                    commission = 0.10;
                    break;
                case "Plovdiv":
                    commission = 0.12;
                    break;
                default:
                    commission = -1;
                    break;
            }
        } else if (sales > 10000) {
            switch (town) {
                case "Sofia":
                    commission = 0.12;
                    break;
                case "Varna":
                    commission = 0.13;
                    break;
                case "Plovdiv":
                    commission = 0.145;
                    break;
                default:
                    commission = -1;
                    break;
            }
        } else {
            commission = -1;
        }

        if (commission >= 0) {
            System.out.printf("%.2f", commission * sales);
        } else {
            System.out.println("error");
        }
    }
}
