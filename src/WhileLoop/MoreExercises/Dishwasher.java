package WhileLoop.MoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottlesDetergent = Integer.parseInt(scanner.nextLine());
        int detergentLeft = bottlesDetergent * 750;

        String command = scanner.nextLine();
        int counter = 0;
        int counterDishes = 0;
        int counterPots = 0;

        while (!command.equals("End")) {
            int load = Integer.parseInt(command);
            counter++;
            if (counter % 3 == 0) {
                detergentLeft -= load * 15;
                counterPots += load;
            } else {
                detergentLeft -= load * 5;
                counterDishes += load;
            }
            if (detergentLeft < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentLeft));
                return;
            }
            command = scanner.nextLine();
        }
        System.out.println("Detergent was enough!");
        System.out.printf("%d dishes and %d pots were washed.%n", counterDishes, counterPots);
        System.out.printf("Leftover detergent %d ml.%n", detergentLeft);
    }
}
