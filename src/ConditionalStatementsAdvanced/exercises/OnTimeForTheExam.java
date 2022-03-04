package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        if (examHour == 0) {
            examHour = 24;
        }

        if (arriveHour == 0) {
            arriveHour = 24;
        }

        int examSumMinutes = examHour * 60 + examMinutes;
        int arriveSumMinutes = arriveHour * 60 + arriveMinutes;

        int difference = examSumMinutes - arriveSumMinutes;

        if (difference < 0) {
            //late
            System.out.println("Late");
            if (Math.abs(difference) < 60) {
                // use minutes only
                System.out.printf("%d minutes after the start", Math.abs(difference));
            } else if (Math.abs(difference) >= 60) {
                // use hours
                int hours = Math.abs(difference) / 60;
                int minutes = Math.abs(difference) % 60;
                if (minutes < 10) {
                    System.out.printf("%d:0%d hours after the start", hours, minutes);
                } else {
                    System.out.printf("%d:%d hours after the start", hours, minutes);
                }
            }
        } else if (difference == 0) {
            //on time
            System.out.println("On time");
        } else if (difference <= 30) {
            //early on time
            System.out.println("On time");
            System.out.printf("%d minutes before the start", difference);
        } else {
            //early
            System.out.println("Early");
            if (difference < 60) {
                // use minutes only
                System.out.printf("%d minutes before the start", difference);
            } else {
                // use hours
                int hours = difference / 60;
                int minutes = difference % 60;
                if (minutes < 10) {
                    System.out.printf("%d:0%d hours before the start", hours, minutes);
                } else {
                    System.out.printf("%d:%d hours before the start", hours, minutes);
                }
            }
        }
    }
}
