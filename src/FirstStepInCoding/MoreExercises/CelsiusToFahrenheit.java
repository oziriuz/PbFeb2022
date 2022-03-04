package FirstStepInCoding.MoreExercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //T (° F) = T (° C) × 9/5 + 32

        double degreeC;
        double degreeF;

        degreeC = Double.parseDouble(scanner.nextLine());

        degreeF = degreeC * 9 / 5 + 32;

        System.out.printf("%.2f", degreeF);
    }
}
