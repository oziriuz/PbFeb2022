package ConditionalStatementsAdvanced.labs;

import java.util.Scanner;

public class WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        String result;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                result = "Working day";
                break;
            case "Saturday":
            case "Sunday":
                result = "Weekend";
                break;
            default:
                result = "Error";
                break;
        }
        System.out.println(result);
    }
}
