package PBExamJuly2020;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfBalls = Integer.parseInt(scanner.nextLine());

        String color = null;
        int points = 0;
        int numOfRed = 0;
        int numOfOrange = 0;
        int numOfYellow = 0;
        int numOfWhite = 0;
        int numOfBlack = 0;
        int numOther = 0;

        for (int i = 0; i < numOfBalls; i++) {
            color = scanner.nextLine();

            switch (color) {
                case "red":
                    points +=5;
                    numOfRed++;
                    break;
                case "orange":
                    points += 10;
                    numOfOrange++;
                    break;
                case "yellow":
                    points += 15;
                    numOfYellow++;
                    break;
                case "white":
                    points += 20;
                    numOfWhite++;
                    break;
                case "black":
                    points = points / 2;
                    numOfBlack++;
                    break;
                default:
                    numOther++;
                    break;
            }
        }

        System.out.println("Total points: " + points);
        System.out.println("Red balls: " + numOfRed);
        System.out.println("Orange balls: " + numOfOrange);
        System.out.println("Yellow balls: " + numOfYellow);
        System.out.println("White balls: " + numOfWhite);
        System.out.println("Other colors picked: " + numOther);
        System.out.println("Divides from black balls: " + numOfBlack);
    }
}
