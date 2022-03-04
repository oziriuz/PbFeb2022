package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Premiere – премиерна прожекция, на цена 12.00 лева.
        //•	Normal – стандартна прожекция, на цена 7.50 лева.
        //•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int places = rows*columns;
        double singlePrice = 0;

        switch (type) {
            case "Premiere" :
                singlePrice = 12.00;
                break;
            case "Normal" :
                singlePrice = 7.50;
                break;
            case "Discount" :
                singlePrice = 5.00;
                break;
            default:
                break;
        }

        double total = places * singlePrice;
        System.out.printf("%.2f", total);
    }
}
