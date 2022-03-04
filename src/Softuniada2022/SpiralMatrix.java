package Softuniada2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    static void spiralPrint(int m, int n, int[][] a) {
        int i;
        int k = 0;
        int l = 0;

        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */

        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;

            // Print the last column from the remaining
            // columns
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            // Print the first column from the remaining
            // columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            List<String> listElements = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split(" ")));
            for (int j = 0; j < listElements.size(); j++) {
                matrix[i][j] = Integer.parseInt(listElements.get(j));
            }
            listElements.clear();
        }

        spiralPrint(rows, columns, matrix);
    }
}
