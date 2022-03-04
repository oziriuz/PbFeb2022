package FirstStepInCoding.lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String architectName;
        int numberOfProjects;
        int timeForOneProject = 3;
        int timeNeededForAllProjects;

        architectName = scanner.nextLine();
        numberOfProjects = Integer.parseInt(scanner.nextLine());
        timeNeededForAllProjects = timeForOneProject * numberOfProjects;
        if (numberOfProjects >= 0 && numberOfProjects <= 100) {
            System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, timeNeededForAllProjects, numberOfProjects);
        } else {
            System.out.println("Number of project is out of limits! Must be between 0 and 100!");
        }
    }
}
