package Softuniada2022;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeCups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String textCup = scanner.nextLine();

        StringBuilder beginSpace = new StringBuilder();
        for (int i = 0; i < n; i++) {
            beginSpace.append(" ");
        }

        for (int i = 0; i < n; i++) {
            System.out.println(beginSpace + "~ ~ ~");
        }

        int limitEqualSign = 3 * n + 5;
        StringBuilder equalsign = new StringBuilder();
        for (int i = 0; i < limitEqualSign; i++) {
            equalsign.append("=");
        }
        System.out.println(equalsign);

        StringBuilder topPartWithText = new StringBuilder("|");
        for (int i = 0; i < n; i++) {
            topPartWithText.append("~");
        }
        topPartWithText.append(textCup.toUpperCase(Locale.ROOT));
        for (int i = 0; i < n; i++) {
            topPartWithText.append("~");
        }
        topPartWithText.append("|");

        int topPartLength = topPartWithText.length();

        for (int i = 0; i < limitEqualSign - topPartLength; i++) {
            topPartWithText.append(" ");
        }
        topPartWithText.append("|");

        StringBuilder topPartNoText = new StringBuilder("|");
        for (int i = 0; i < topPartLength - 2; i++) {
            topPartNoText.append("~");
        }
        topPartNoText.append("|");

        for (int i = 0; i < limitEqualSign - topPartLength; i++) {
            topPartNoText.append(" ");
        }
        topPartNoText.append("|");
        int textPosition = n / 2;

        if (n % 2 == 0) {
            for (int i = textPosition; i < n - 1; i++) {
                System.out.println(topPartNoText);
            }

        } else {
            for (int i = textPosition; i < n - 2; i++) {
                System.out.println(topPartNoText);
            }
        }

        System.out.println(topPartWithText);

        for (int i = textPosition; i < n - 2; i++) {
            System.out.println(topPartNoText);
        }
        System.out.println(equalsign);

        StringBuilder cup = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                cup.append(" ");
            }
            cup.append("\\");
            for (int j = 0; j < topPartLength - i - 2; j++) {
                cup.append("@");
            }

            cup.append("/");
            System.out.println(cup);
            cup = new StringBuilder();
            topPartLength--;
        }

        StringBuilder bottom = new StringBuilder();
        for (int i = 0; i < equalsign.length(); i++) {
            bottom.append("-");
        }
        System.out.println(bottom);
    }
}
