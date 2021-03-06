package PBExamMarch2020;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double secondsWR = Double.parseDouble(scanner.nextLine());
        double distanceWR = Double.parseDouble(scanner.nextLine());
        double secondsForOneMeter = Double.parseDouble(scanner.nextLine());

        double secondsTotal = secondsForOneMeter * distanceWR;
        double slow = ((int) (distanceWR / 50) * 30);
        secondsTotal += slow;

        double rest = secondsWR - secondsTotal;

        if (rest > 0) {
            System.out.printf("Yes! The new record is %.2f seconds.", secondsTotal);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(rest));
        }
    }
}
