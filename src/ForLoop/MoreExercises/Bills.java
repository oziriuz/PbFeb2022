package ForLoop.MoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double internet = 15.00;
        double water = 20.00;
        int months = Integer.parseInt(scanner.nextLine());
        double sumElectricity = 0;
        double sumInternet = internet * months;
        double sumWater = water * months;
        double sumOther = 0;

        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            double other = 1.20 * (internet + water + electricity);
            sumElectricity += electricity;
            sumOther += other;
        }

        double average = (sumElectricity + sumWater + sumInternet + sumOther)/months;

        System.out.printf("Electricity: %.2f lv%n", sumElectricity);
        System.out.printf("Water: %.2f lv%n", sumWater);
        System.out.printf("Internet: %.2f lv%n", sumInternet);
        System.out.printf("Other: %.2f lv%n", sumOther);
        System.out.printf("Average: %.2f lv", average);
    }
}
