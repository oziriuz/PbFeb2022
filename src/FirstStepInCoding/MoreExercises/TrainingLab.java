package FirstStepInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double WORKPLACE_LENGTH = 1.20;
        final double WORKPLACE_WIDTH = 0.70;
        final double CORRIDOR_WIDTH = 1.00;
        final int BUSY_WORKPLACES = 3;

        double w_Length;
        double h_Width;
        double usable_h_Width;

        int workplacesByLength;
        int workplacesByWidth;
        int workplacesCalculated;
        int totalWorkplaces;

        w_Length = Double.parseDouble(scanner.nextLine());
        h_Width = Double.parseDouble(scanner.nextLine());

        usable_h_Width = h_Width - CORRIDOR_WIDTH;

        workplacesByLength = (int) (w_Length / WORKPLACE_LENGTH);
        workplacesByWidth = (int) (usable_h_Width / WORKPLACE_WIDTH);
        workplacesCalculated = workplacesByLength * workplacesByWidth;
        totalWorkplaces = workplacesCalculated - BUSY_WORKPLACES;

        System.out.println(totalWorkplaces);
    }
}
