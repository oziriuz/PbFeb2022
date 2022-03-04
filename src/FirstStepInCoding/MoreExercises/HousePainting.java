package FirstStepInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double EXPENSE_GREEN_PAINT = 3.4;
        final double EXPENSE_RED_PAINT = 4.3;
        final double AREA_DOOR = 1.2 * 2;
        final double AREA_WINDOW = 1.50 * 1.50;

        double x_HouseHeight;
        double y_HouseSideLength;
        double h_RoofHeight;

        double areaBack;
        double areaFront;
        double areaTwoSides;
        double areaTrianglesRoof;
        double areaRectanglesRoof;
        double areaGreen;
        double areaRed;
        double greenPaint;
        double redPaint;

        x_HouseHeight = Double.parseDouble(scanner.nextLine());
        y_HouseSideLength = Double.parseDouble(scanner.nextLine());
        h_RoofHeight = Double.parseDouble(scanner.nextLine());

        areaBack = x_HouseHeight * x_HouseHeight;
        areaFront = areaBack - AREA_DOOR;
        areaTwoSides = 2 * (x_HouseHeight * y_HouseSideLength - AREA_WINDOW);
        areaGreen = areaBack + areaFront + areaTwoSides;
        greenPaint = areaGreen / EXPENSE_GREEN_PAINT;

        areaTrianglesRoof = 2 * (x_HouseHeight * h_RoofHeight / 2);
        areaRectanglesRoof = 2 * (x_HouseHeight * y_HouseSideLength);
        areaRed = areaTrianglesRoof + areaRectanglesRoof;
        redPaint = areaRed / EXPENSE_RED_PAINT;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
