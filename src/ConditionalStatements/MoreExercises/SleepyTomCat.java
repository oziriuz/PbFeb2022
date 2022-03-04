package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());

        int workingDays = 365 - daysOff;

        int playTime = daysOff * 127 + workingDays * 63;

        int diff = 30_000 - playTime;

        int diffHours = Math.abs(diff / 60);
        int diffMinutes = Math.abs(diff % 60);

        if(playTime > 30_000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", diffHours, diffMinutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", diffHours, diffMinutes);
        }
    }
}
