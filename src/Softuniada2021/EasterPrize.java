package Softuniada2021;

import java.util.Scanner;

public class EasterPrize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int stopNumber = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;
        int counter = 0;

        for (int i = startNumber; i <= stopNumber; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i != 1) {
                counter++;
                System.out.printf("%d ", i);
            }
            isPrime = true;
        }
        System.out.println();
        System.out.printf("The total number of prime numbers between %d to %d is %d", startNumber, stopNumber, counter);
    }
}

