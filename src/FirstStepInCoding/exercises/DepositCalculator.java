package FirstStepInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum;
        int depositMonths;
        double yearInterest;
        double result;

        depositSum = Double.parseDouble(scanner.nextLine());
        depositMonths = Integer.parseInt(scanner.nextLine());
        yearInterest = Double.parseDouble(scanner.nextLine());

        result = depositSum + depositMonths * ((depositSum * (yearInterest / 100)) / 12);

        System.out.println(result);
    }
}
