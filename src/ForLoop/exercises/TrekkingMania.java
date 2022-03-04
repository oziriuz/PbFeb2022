package ForLoop.exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfGroups = Integer.parseInt(scanner.nextLine());

        int peopleMusala = 0;
        int peopleMonblan = 0;
        int peopleKili = 0;
        int peopleK2 = 0;
        int peopleEverest = 0;

        int sumPeople = 0;

        double percentMusala = 0;
        double percentMonblan = 0;
        double percentKili = 0;
        double percentK2 = 0;
        double percentEverest = 0;

        for (int i = 0; i < numOfGroups; i++) {
            int numOfPeople = Integer.parseInt(scanner.nextLine());

            sumPeople += numOfPeople;

            if (numOfPeople < 6) {
                peopleMusala += numOfPeople;
            } else if (numOfPeople < 13) {
                peopleMonblan += numOfPeople;
            } else if (numOfPeople < 26) {
                peopleKili += numOfPeople;
            } else if (numOfPeople < 41) {
                peopleK2 += numOfPeople;
            } else {
                peopleEverest += numOfPeople;
            }
        }

        percentMusala = (double) peopleMusala / sumPeople * 100;
        percentMonblan = (double) peopleMonblan / sumPeople * 100;
        percentKili = (double) peopleKili / sumPeople * 100;
        percentK2 = (double) peopleK2 / sumPeople * 100;
        percentEverest = (double) peopleEverest / sumPeople * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMonblan);
        System.out.printf("%.2f%%%n", percentKili);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);
    }
}
