package WhileLoop.lab;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = Integer.parseInt(scanner.nextLine());

        int k = 1;

        while (k <= limit) {
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
