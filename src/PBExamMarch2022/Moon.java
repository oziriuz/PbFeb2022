package PBExamMarch2022;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avSpeed = Double.parseDouble(scanner.nextLine());
        double litresPer100 = Double.parseDouble(scanner.nextLine());

        double time = Math.ceil(768_800 / avSpeed) + 3;
        double gas = 768_800 * litresPer100 / 100;

        System.out.printf("%.0f%n", time);
        System.out.printf("%.0f", gas);
    }
}
