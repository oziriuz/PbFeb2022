package ForLoop.MoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int maxPatientsPerDay = 7;
        int sumTreated = 0;
        int sumUntreated = 0;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && sumUntreated > sumTreated) {
                maxPatientsPerDay++;
            }
            if (patients > maxPatientsPerDay) {
                sumUntreated += (patients - maxPatientsPerDay);
                sumTreated += maxPatientsPerDay;
            } else {
                sumTreated += patients;
            }
        }
        System.out.println("Treated patients: " + sumTreated + ".");
        System.out.println("Untreated patients: " + sumUntreated + ".");
    }
}
