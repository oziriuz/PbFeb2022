package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред са необходимите часовете – цяло число в интервала [0 ... 200 000]
        //•	На втория ред са дните, с които фирмата разполага – цяло число в интервала [0 ... 20 000]
        //•	На третия ред е броят на служителите, работещи извънредно – цяло число в интервала [0 ... 200]

        int hoursNeededForProject = Integer.parseInt(scanner.nextLine());
        double daysAvailable = Integer.parseInt(scanner.nextLine());
        int workerAvailableOvertime = Integer.parseInt(scanner.nextLine());

        double hoursOvertime = daysAvailable * workerAvailableOvertime * 2;

        daysAvailable = daysAvailable * 0.90; // 10% of days for learning

        double hoursAvailable = daysAvailable * 8;

        double totalHours = hoursAvailable + hoursOvertime;

        double hoursLeft = Math.floor(totalHours) - hoursNeededForProject;

        if (hoursLeft < 0) {
            System.out.printf("Not enough time!%.0f hours needed.", Math.abs(hoursLeft));
        } else {
            System.out.printf("Yes!%.0f hours left.", hoursLeft);
        }
    }
}
