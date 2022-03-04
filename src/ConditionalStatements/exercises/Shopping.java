package ConditionalStatements.exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceGPU = 250.00;

        double budget = Double.parseDouble(scanner.nextLine());
        int numGPUs = Integer.parseInt(scanner.nextLine());
        int numCPUs = Integer.parseInt(scanner.nextLine());
        int numRAMs = Integer.parseInt(scanner.nextLine());

        double priceCPU = priceGPU*numGPUs*0.35;
        double priceRAMs = priceGPU*numGPUs*0.1;

        double totalCost = numGPUs*priceGPU + numCPUs*priceCPU + numRAMs*priceRAMs;

        if (numGPUs > numCPUs) {
            totalCost = totalCost * 0.85;
        }

        double rest = budget - totalCost;
        if (rest < 0) {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(rest));
        } else {
            System.out.printf("You have %.2f leva left!", Math.abs(rest));
        }
    }
}
