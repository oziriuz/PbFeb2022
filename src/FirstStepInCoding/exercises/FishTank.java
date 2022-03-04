package FirstStepInCoding.exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthCM;
        int widthCM;
        int heightCM;
        double percent;

        double lengthDM;
        double widthDM;
        double heightDM;
        double totalVolume;
        double litersNeeded;

        lengthCM = Integer.parseInt(scanner.nextLine());
        widthCM = Integer.parseInt(scanner.nextLine());
        heightCM = Integer.parseInt(scanner.nextLine());
        percent = Double.parseDouble(scanner.nextLine());

        lengthDM = lengthCM * 0.1;
        widthDM = widthCM * 0.1;
        heightDM = heightCM * 0.1;

        totalVolume = lengthDM * widthDM * heightDM;
        litersNeeded = totalVolume * (1 - percent / 100);

        System.out.println(litersNeeded);
    }
}
