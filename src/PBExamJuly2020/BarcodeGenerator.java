package PBExamJuly2020;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startRange = Integer.parseInt(scanner.nextLine());
        int stopRange = Integer.parseInt(scanner.nextLine());

        for (int i = startRange; i <= stopRange; i++) {
            //remove all even figures
            if (i % 2 != 0 && (i / 10) % 2 != 0 && (i / 100) % 2 != 0 && (i / 1000) % 2 != 0) {
                //remove second figure range
                if ((i / 100) % 10 >= (startRange / 100) % 10 && (i / 100) % 10 <= (stopRange / 100) % 10) {
                    //remove third figure range
                    if ((i / 10) % 10 >= (startRange / 10) % 10 && (i / 10) % 10 <= (stopRange / 10) % 10) {
                        //remove forth figure range
                        if (i % 10 >= startRange % 10 && i % 10 <= stopRange % 10)
                            System.out.printf("%d ", i);
                    }
                }
            }
        }
    }
}
