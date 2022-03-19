package NestedLoops.MoreExercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char stop = scanner.nextLine().charAt(0);
        char skip = scanner.nextLine().charAt(0);

        char first;
        char second;
        char third;

        int counter = 0;

        for (int i = start; i <= stop; i++) {
            if (i == skip) {
                continue;
            } else {
                first = (char) i;
            }
            for (int j = start; j <= stop; j++) {
                if (j == skip) {
                    continue;
                } else {
                    second = (char) j;
                }
                for (int k = start; k <= stop; k++) {
                    if (k == skip) {
                        continue;
                    } else {
                        third = (char) k;
                    }
                    System.out.printf("%c%c%c ", first, second, third);
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
