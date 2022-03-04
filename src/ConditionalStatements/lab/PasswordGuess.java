package ConditionalStatements.lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String PASSWORD = "s3cr3t!P@ssw0rd";

        String tryPassword = scanner.nextLine();

        if (tryPassword.equals(PASSWORD)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
