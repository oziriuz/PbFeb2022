package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class NumbersFrom1To10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while (i <= 10) {
            System.out.println(i++);
        }
    }
}
