package PBPreExamMarch2022;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int start = 5364;
        int stop = 8848;
        int days = 1;

        while (!command.equals("END")) {
            if (command.equals("Yes")) {
                days++;
            }
            if (days > 5) {
                break;
            }
            int meters = Integer.parseInt(scanner.nextLine());
            start += meters;
            if (start >= stop) {
                System.out.printf("Goal reached for %d days!", days);
                return;
            }

            command = scanner.nextLine();
        }
        System.out.println("Failed!");
        System.out.println(start);
    }
}
