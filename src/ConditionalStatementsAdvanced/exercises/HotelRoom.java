package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        //              Май и октомври	Юни и септември         	    Юли и август
        //Студио –      50 лв./нощувка	Студио – 75.20 лв./нощувка	    Студио – 76 лв./нощувка
        //Апартамент –  65 лв./нощувка	Апартамент – 68.70 лв./нощувка	Апартамент – 77 лв./нощувка

        //•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
        //•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
        //•	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.


        //месецът – May, June, July, August, September или October

        double priceApartment = 0;
        double priceStudio = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = nights * 50.00;
                priceApartment = nights * 65.00;
                if (nights > 7 && nights <= 14) {
                    priceStudio = priceStudio * 0.95;
                } else if (nights > 14) {
                    priceStudio = priceStudio * 0.7;
                }
                break;
            case "June":
            case "September":
                priceStudio = nights * 75.20;
                priceApartment = nights * 68.70;
                if (nights > 14) {
                    priceStudio = priceStudio * 0.8;
                }
                break;
            case "July":
            case "August":
                priceStudio = nights * 76.00;
                priceApartment = nights * 77.00;
                break;
            default:
                break;
        }
        //•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
        if (nights > 14) {
            priceApartment = priceApartment * 0.9;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}
