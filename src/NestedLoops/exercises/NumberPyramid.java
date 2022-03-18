package NestedLoops.exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 1;
outer:
        for (int rows = 1; rows <= n ; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                if (counter > n) {
                    break outer;
                }
                if (cols > rows){
                    break;
                }
                System.out.printf("%d ", counter++);
            }
            System.out.println();
        }
    }
}
