package FirstStepInCoding.lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches;
        double centimeters;
        inches = Double.parseDouble(scanner.nextLine());
        centimeters = inches * 2.54;
        System.out.println(centimeters);
    }
}
