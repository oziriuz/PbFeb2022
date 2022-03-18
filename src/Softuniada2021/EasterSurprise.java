package Softuniada2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EasterSurprise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coord = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        int r = Integer.parseInt(coord.get(0));
        int c = Integer.parseInt(coord.get(1));
        String[][] matrix = new String[r][c];

        List<String> rowChar = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            rowChar.addAll(Arrays.asList(scanner.nextLine().split(" ")));
            for (int j = 0; j < c; j++) {
                matrix[i][j] = rowChar.get(j);
            }
            rowChar.clear();
        }
        String symbolFound = scanner.nextLine();
        List<String> searchCoord = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        int initialR = Integer.parseInt(searchCoord.get(0));
        int initialC = Integer.parseInt(searchCoord.get(1));

        if (initialR < 0 || initialR >= r || initialC < 0 || initialC >= c) {
            return;
        }

        String initialSymbol = matrix[initialR][initialC];
        matrix[initialR][initialC] = symbolFound;


        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (matrix[row][col].equals(initialSymbol)) {
                    if ((row < r - 1 && matrix[row + 1][col].equals(symbolFound)) ||
                            (col < c - 1 && matrix[row][col + 1].equals(symbolFound)) ||
                            (row > 0 && matrix[row - 1][col].equals(symbolFound)) ||
                            (col > 0 && matrix[row][col - 1].equals(symbolFound))) {
                        matrix[row][col] = symbolFound;
                    }
                }
            }
            for (int col = c - 1; col >= 0; col--) {
                if (matrix[row][col].equals(initialSymbol)) {
                    if ((row < r - 1 && matrix[row + 1][col].equals(symbolFound)) ||
                            (col < c - 1 && matrix[row][col + 1].equals(symbolFound)) ||
                            (row > 0 && matrix[row - 1][col].equals(symbolFound)) ||
                            (col > 0 && matrix[row][col - 1].equals(symbolFound))) {
                        matrix[row][col] = symbolFound;
                    }
                }
            }
        }

        for (int row = r - 1; row >= 0; row--) {
            for (int col = 0; col < c; col++) {
                if (matrix[row][col].equals(initialSymbol)) {
                    if ((row < r - 1 && matrix[row + 1][col].equals(symbolFound)) ||
                            (col < c - 1 && matrix[row][col + 1].equals(symbolFound)) ||
                            (row > 0 && matrix[row - 1][col].equals(symbolFound)) ||
                            (col > 0 && matrix[row][col - 1].equals(symbolFound))) {
                        matrix[row][col] = symbolFound;
                    }
                }
            }
            for (int col = c - 1; col >= 0; col--) {
                if (matrix[row][col].equals(initialSymbol)) {
                    if ((row < r - 1 && matrix[row + 1][col].equals(symbolFound)) ||
                            (col < c - 1 && matrix[row][col + 1].equals(symbolFound)) ||
                            (row > 0 && matrix[row - 1][col].equals(symbolFound)) ||
                            (col > 0 && matrix[row][col - 1].equals(symbolFound))) {
                        matrix[row][col] = symbolFound;
                    }
                }
            }
        }

        // exit
        for (int rMatrix = 0; rMatrix < r; rMatrix++) {
            for (int cMatrix = 0; cMatrix < c; cMatrix++) {
                System.out.print(matrix[rMatrix][cMatrix]);
            }
            System.out.println();
        }
    }
}
