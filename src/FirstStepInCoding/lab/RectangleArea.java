package FirstStepInCoding.lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int area;
        a = Integer.parseInt(scanner.nextLine());
        b = Integer.parseInt(scanner.nextLine());
        area = a * b;
        System.out.println(area);
    }
}
