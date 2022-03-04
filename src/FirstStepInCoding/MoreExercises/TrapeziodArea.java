package FirstStepInCoding.MoreExercises;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b1;
        double b2;
        double h;

        double areaTrapezoid;

        b1 = Double.parseDouble(scanner.nextLine());
        b2 = Double.parseDouble(scanner.nextLine());
        h = Double.parseDouble(scanner.nextLine());

        areaTrapezoid = (b1 + b2) * h / 2;

        System.out.printf("%.2f", areaTrapezoid);
    }
}
