package ForLoop.exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;

        for (int i = 0; i < lines; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                n1++;
            } else if (number < 400) {
                n2++;
            } else if (number < 600) {
                n3++;
            } else if (number < 800) {
                n4++;
            } else {
                n5++;
            }
        }

        double p1 = (double) n1 / lines * 100;
        double p2 = (double) n2 / lines * 100;
        double p3 = (double) n3 / lines * 100;
        double p4 = (double) n4 / lines * 100;
        double p5 = (double) n5 / lines * 100;

        System.out.printf("%.2f%% %n", p1);
        System.out.printf("%.2f%% %n", p2);
        System.out.printf("%.2f%% %n", p3);
        System.out.printf("%.2f%% %n", p4);
        System.out.printf("%.2f%% %n", p5);

    }
}
