package PBExamMarch2020;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String load = scanner.nextLine();
        int numberOfCases = 1;
        boolean hasSpace = true;

        while (!load.equals("End")) {
            double loadInKg = Double.parseDouble(load);
            if (numberOfCases % 3 == 0) {
                loadInKg = loadInKg * 1.1;
            }
            if (capacity < loadInKg) {
                System.out.println("No more space!");
                hasSpace = false;
                break;
            }
            numberOfCases++;
            capacity -= loadInKg;
            load = scanner.nextLine();
        }
        if (hasSpace) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", numberOfCases-1);
    }
}
