package NestedLoops.exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int current;

        int sumPrime = 0;
        int sumNonPrime = 0;
        boolean isPrime = true;

        while (!command.equals("stop")) {
            current = Integer.parseInt(command);
            if (current < 0) {
                System.out.println("Number is negative.");
            }
            if (current == 1) {
                sumNonPrime += current;
            }
            for (int i = 2; i < current; i++) {
                if (current % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (current > 1) {
                if (isPrime) {
                    sumPrime += current;
                } else {
                    sumNonPrime += current;
                }
            }
            isPrime = true;
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);
    }
}
