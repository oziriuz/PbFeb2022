package Softuniada2021;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = 2 * rows - 1;
        String[][] eggs = new String[rows][columns];
        int egg = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < rows; c++) {
                if (r == 0) {
                    eggs[r][c] = String.format("%d", ++egg);
                } else {
                    //leading spaces = r
                    if (c < r) {
                        eggs[r][c] = " ";
                    } else {
                        //fill numbers
                        eggs[r][c] = String.format("%d", ++egg - r);
                    }
                }
            }
            for (int c = rows; c < columns; c++) {
                if (r == 0) {
                    eggs[r][c] = String.format("%d", --egg);
                } else {
                    //trailing spaces = r
                    if (c > columns - r - 1) {
                        eggs[r][c] = " ";
                    } else {
                        //fill numbers
                        eggs[r][c] = String.format("%d", --egg - r);
                    }
                }
            }
        }
        for (int rMatrix = 0; rMatrix < rows; rMatrix++){
            for (int cMatrix = 0; cMatrix < columns; cMatrix++){
                System.out.print(eggs[rMatrix][cMatrix]);
            }
            System.out.println();
        }
    }
}
