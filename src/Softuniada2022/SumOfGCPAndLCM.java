package Softuniada2022;

import java.util.Scanner;

public class SumOfGCPAndLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int gcp = 1;
        int min = Math.min(n, m);

        for (int i = min; i > 1; i--) {
            if (n % i == 0 && m % i == 0) {
                gcp = i;
                break;
            }
        }

        int max;
        int step;
        int lcm;

        if (n > m) {
            max = step = n;
        } else {
            max = step = m;
        }

        while (true) {
            if (max % n == 0 && max % m == 0) {
                lcm = max;
                break;
            }
            max += step;
        }
        System.out.println(gcp + lcm);
    }
}

