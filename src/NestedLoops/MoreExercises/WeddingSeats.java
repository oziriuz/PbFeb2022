package NestedLoops.MoreExercises;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sector;
        char sectorPrint;
        int sectorAscii;
        int rows;
        int rowsPrint;
        int seatOfOddRows;
        char seatOfOddRowsAscii;
        int seatOfEvenRows;
        char seatOfEvenRowsAscii;
        int seatCounter = 0;

        sector = scanner.next().charAt(0);
        scanner.nextLine();
        sectorAscii = sector;
        rows = Integer.parseInt(scanner.nextLine());
        seatOfOddRows = Integer.parseInt(scanner.nextLine());
        seatOfEvenRows = seatOfOddRows + 2;

        for (int i = 'A'; i <= sectorAscii; i++) {
            sectorPrint = (char) i;
            for (int j = 1; j <= rows; j++) {
                rowsPrint = j;
                if (rowsPrint % 2 != 0 || rows == 1)
                    for (int k = 'a'; k <= (int) 'a' + seatOfOddRows - 1; k++) {
                        seatOfOddRowsAscii = (char) k;
                        System.out.printf("%c%d%c%n", sectorPrint, rowsPrint, seatOfOddRowsAscii);
                        seatCounter++;
                    }
                else
                    for (int l = 'a'; l <= (int) 'a' + seatOfEvenRows - 1; l++) {
                        seatOfEvenRowsAscii = (char) l;
                        System.out.printf("%c%d%c%n", sectorPrint, rowsPrint, seatOfEvenRowsAscii);
                        seatCounter++;
                    }
            }
            rows++;
        }
        System.out.println(seatCounter);
    }
}
