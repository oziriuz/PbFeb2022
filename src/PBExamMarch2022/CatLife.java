package PBExamMarch2022;

import java.util.Scanner;

public class CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String breed = scanner.nextLine();
        char gender = scanner.nextLine().charAt(0);
        int years = 0;

        switch (breed) {
            case "British Shorthair":
                if (gender == 'm') {
                    years = 13;
                } else if (gender == 'f') {
                    years = 14;
                }
                break;
            case "Siamese":
                if (gender == 'm') {
                    years = 15;
                } else if (gender == 'f') {
                    years = 16;
                }
                break;
            case "Persian":
                if (gender == 'm') {
                    years = 14;
                } else if (gender == 'f') {
                    years = 15;
                }
                break;
            case "Ragdoll":
                if (gender == 'm') {
                    years = 16;
                } else if (gender == 'f') {
                    years = 17;
                }
                break;
            case "American Shorthair":
                if (gender == 'm') {
                    years = 12;
                } else if (gender == 'f') {
                    years = 13;
                }
                break;
            case "Siberian":
                if (gender == 'm') {
                    years = 11;
                } else if (gender == 'f') {
                    years = 12;
                }
                break;
            default:
                System.out.printf("%s is invalid cat!", breed);
                return;
        }

        double result = years * 12 / 6.0;
        result = Math.floor(result);

        System.out.printf("%.0f cat months", result);
    }
}
