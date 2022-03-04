package ConditionalStatements.exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double secondsWR = Double.parseDouble(scanner.nextLine());
        double distanceWR = Double.parseDouble(scanner.nextLine());
        double secondsForOneMeter = Double.parseDouble(scanner.nextLine());

        double secondsTotal = secondsForOneMeter * distanceWR;
        double slow =  ((int)(distanceWR / 15) * 12.5);
        secondsTotal += slow;

        double rest = secondsWR - secondsTotal;

        if (rest > 0) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", secondsTotal);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(rest));
        }
    }
}
