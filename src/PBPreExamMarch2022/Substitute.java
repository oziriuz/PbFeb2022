package PBPreExamMarch2022;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberK = Integer.parseInt(scanner.nextLine());
        int numberL = Integer.parseInt(scanner.nextLine());
        int numberM = Integer.parseInt(scanner.nextLine());
        int numberN = Integer.parseInt(scanner.nextLine());

        String resultFirst;
        String resultSecond;
        boolean firstIsOK;
        boolean secondIsOK;

        int counter = 0;

        //first number
        for (int j = numberK; j <= 8; j++) {
            for (int k = 9; k >= numberL; k--) {
                firstIsOK = false;
                resultFirst = String.format("%d%d", j, k);
                if (j % 2 == 0 && k % 2 != 0) {
                    firstIsOK = true;
                }
                //second number
                for (int m = numberM; m <= 8; m++) {
                    for (int n = 9; n >= numberN; n--) {
                        secondIsOK = false;
                        resultSecond = String.format("%d%d", m, n);
                        if (m % 2 == 0 && n % 2 != 0) {
                            secondIsOK = true;
                        }
                        if (firstIsOK && secondIsOK && !resultFirst.equals(resultSecond)) {
                            System.out.printf("%s - %s%n", resultFirst, resultSecond);
                            counter++;
                        } else if (firstIsOK && secondIsOK && resultFirst.equals(resultSecond)) {
                            System.out.println("Cannot change the same player.");
                        }
                        if (counter >= 6) {
                            return;
                        }
                    }
                }
            }
        }
    }
}

