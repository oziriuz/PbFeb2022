package PBPreExamMarch2022;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        //	            Пролет (spring)	    Лято (summer)	    Есен (autumn)	    Зима (winter)
        //До 5 човека	50.00 лв. на човек	48.50 лв. на човек	60.00 лв. на човек	86.00 лв. на човек
        //Над 5 човека	48.00 лв. на човек	45.00 лв. на човек	49.50 лв. на човек	85.00 лв. на човек
        //В зависимост от сезона, може да има отстъпка или оскъпяване на цената, съответно:
        //•	При "summer" -> 15% отстъпка
        //•	При "winter" -> 8% оскъпяване

        double singlePrice = 0;

        switch (season) {
            case "spring":
                if (people > 5) {
                    singlePrice = 48.00;
                } else {
                    singlePrice = 50.00;
                }
                break;
            case "summer":
                if (people > 5) {
                    singlePrice = 45.00;
                } else {
                    singlePrice = 48.50;
                }
                singlePrice = 0.85 * singlePrice;
                break;
            case "autumn":
                if (people > 5) {
                    singlePrice = 49.50;
                } else {
                    singlePrice = 60.00;
                }
                break;
            case "winter":
                if (people > 5) {
                    singlePrice = 85.00;
                } else {
                    singlePrice = 86.00;
                }
                singlePrice = 1.08 * singlePrice;
                break;
            default:
                break;
        }

        double result = people * singlePrice;

        System.out.printf("%.2f leva.", result);
    }
}
