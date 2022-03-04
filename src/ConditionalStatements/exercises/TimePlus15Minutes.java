package ConditionalStatements.exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sumMinutes = hours * 60 + minutes + 15;

        hours = sumMinutes / 60;
        minutes = sumMinutes % 60;

        if (hours == 24){
            hours = 0;
        } else if (hours > 24) {
            hours -= 24;
        }

        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
