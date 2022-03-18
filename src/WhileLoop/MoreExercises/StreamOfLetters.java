package WhileLoop.MoreExercises;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder();
        boolean hasC = false;
        boolean hasO = false;
        boolean hasN = false;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            char letter = input.charAt(0);

            //ignore not english letters
            if ((letter < 65 || letter > 90) && (letter < 97 || letter > 122)) {
                input = scanner.nextLine();
                continue;
            }

            if (hasC && hasN && hasO) {
                System.out.printf("%s ", result);
                result = new StringBuilder();
                hasC = false;
                hasN = false;
                hasO = false;
            }

            if (letter == 'c' && !hasC) {
                hasC = true;
                input = scanner.nextLine();
                continue;
            }
            if (letter == 'o' && !hasO) {
                hasO = true;
                input = scanner.nextLine();
                continue;
            }
            if (letter == 'n' && !hasN) {
                hasN = true;
                input = scanner.nextLine();
                continue;
            }

            result.append(letter);


            input = scanner.nextLine();
        }
        if (hasC && hasN && hasO) {
            System.out.printf("%s ", result);
        }
    }
}
