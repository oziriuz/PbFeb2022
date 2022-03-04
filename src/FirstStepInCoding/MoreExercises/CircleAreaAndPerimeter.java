package FirstStepInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r_Radius;

        double circleArea;
        double circlePerimeter;

        r_Radius = Double.parseDouble(scanner.nextLine());

        circleArea = Math.PI * r_Radius * r_Radius;
        circlePerimeter = 2 * Math.PI * r_Radius;

        System.out.printf("%.2f%n", circleArea);
        System.out.printf("%.2f", circlePerimeter);
    }
}
