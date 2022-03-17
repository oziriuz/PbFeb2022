package WhileLoop.exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int numberOfPacks = width * length * height;
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            numberOfPacks -= Integer.parseInt(command);
            if (numberOfPacks < 0 ){
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(numberOfPacks));
                return;
            }

            command = scanner.nextLine();
        }
        System.out.printf("%d Cubic meters left.", numberOfPacks);
    }
}
