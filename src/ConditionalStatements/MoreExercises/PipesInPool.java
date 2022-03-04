package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v =Integer.parseInt(scanner.nextLine()); //total litres
        int p1 = Integer.parseInt(scanner.nextLine()); //litres/hour
        int p2 = Integer.parseInt(scanner.nextLine()); //litres/hour
        double h = Double.parseDouble(scanner.nextLine()); //hours

        double litresFull = (p1 + p2)*h;

        if (v >= litresFull) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    litresFull/v*100, p1*h/litresFull*100, p2*h/litresFull*100);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, Math.abs(v-litresFull));
        }
    }
}
