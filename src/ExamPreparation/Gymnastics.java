package ExamPreparation;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String gadget = scanner.nextLine();

        double complexity = 0;
        double performance = 0;

        switch (country) {
            case "Russia":
                switch (gadget) {
                    case "ribbon":
                        complexity = 9.1;
                        performance = 9.4;
                        break;
                    case "hoop":
                        complexity = 9.3;
                        performance = 9.8;
                        break;
                    case "rope":
                        complexity = 9.6;
                        performance = 9.0;
                        break;
                }
                break;
            case "Bulgaria":
                switch (gadget) {
                    case "ribbon":
                        complexity = 9.6;
                        performance = 9.4;
                        break;
                    case "hoop":
                        complexity = 9.55;
                        performance = 9.75;
                        break;
                    case "rope":
                        complexity = 9.5;
                        performance = 9.4;
                        break;
                }
                break;
            case "Italy":
                switch (gadget) {
                    case "ribbon":
                        complexity = 9.2;
                        performance = 9.5;
                        break;
                    case "hoop":
                        complexity = 9.45;
                        performance = 9.35;
                        break;
                    case "rope":
                        complexity = 9.7;
                        performance = 9.15;
                        break;
                }
                break;
            default:
                break;
        }

        double result = complexity + performance;
        double percent = (20 - result)/20 * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, result, gadget);
        System.out.printf("%.2f%%", percent);
    }
}
