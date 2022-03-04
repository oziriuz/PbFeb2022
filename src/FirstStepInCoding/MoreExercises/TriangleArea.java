package FirstStepInCoding.MoreExercises;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double h;

        double area;

        a = Double.parseDouble(scanner.nextLine());
        h = Double.parseDouble(scanner.nextLine());

        area = a * h / 2;

        System.out.printf("%.2f", area);
    }
}
