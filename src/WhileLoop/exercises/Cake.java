package WhileLoop.exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int numberOfPieces = length * width;
        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            numberOfPieces -= Integer.parseInt(command);
            if (numberOfPieces < 0 ){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(numberOfPieces));
                return;
            }

            command = scanner.nextLine();
        }
        System.out.printf("%d pieces are left.", numberOfPieces);
    }
}
