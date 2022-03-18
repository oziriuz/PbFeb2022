package WhileLoop.exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumSteps = 0;
        int steps;
        int targetSteps = 10_000;
        while (!input.equals("Going home")){
            steps = Integer.parseInt(input);
            sumSteps += steps;

            if (sumSteps >= targetSteps) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", sumSteps - targetSteps);
                return;
            }
            input = scanner.nextLine();
        }
        steps = Integer.parseInt(scanner.nextLine());
        sumSteps += steps;
        if (targetSteps <= sumSteps) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - targetSteps);
        } else {
            System.out.printf("%d more steps to reach goal.", targetSteps - sumSteps);
        }
    }
}
