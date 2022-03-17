package WhileLoop.exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badScoresLimit = Integer.parseInt(scanner.nextLine());
        int badScores = 0;
        int sumProblems = 0;
        String problemName = scanner.nextLine();
        int problemScore = 0;
        int sumScrores = 0;
        String lastProblem = "";

        while (!problemName.equals("Enough")) {
            problemScore = Integer.parseInt(scanner.nextLine());
            if (problemScore <= 4) {
                badScores++;
            }
            sumProblems++;
            sumScrores += problemScore;
            if (badScores >= badScoresLimit) {
                System.out.printf("You need a break, %d poor grades.", badScores);
                return;
            }
            problemName = scanner.nextLine();
            if (!problemName.equals("Enough")) {
                lastProblem = problemName;
            }
        }

        System.out.printf("Average score: %.2f%n", 1.0 * sumScrores/sumProblems);
        System.out.printf("Number of problems: %d%n", sumProblems);
        System.out.printf("Last problem: %s", lastProblem);
    }
}
