package FirstStepInCoding.exercises;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians;
        double degrees;

        radians = Double.parseDouble(scanner.nextLine());
        degrees = radians * 180 / Math.PI;

        System.out.println(degrees);
    }
}
