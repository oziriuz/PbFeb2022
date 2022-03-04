package ConditionalStatementsAdvanced.labs;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        String result = "";
        if (gender.equals("m")) {
            if (age < 16) {
                result = "Master";
            } else {
                result = "Mr.";
            }
        }

        if (gender.equals("f")) {
            if (age < 16) {
                result = "Miss";
            } else {
                result = "Ms.";
            }
        }

        System.out.println(result);
    }
}
