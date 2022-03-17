package WhileLoop.exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int coinsCounter = 0;
        double[] value = {2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        while (money > 0) {
            for (int i = 0; i < value.length; i++) {
                if (money >= value[i]) {
                    money -= value[i];
                    money = Math.round(money*100)/100.0;
                    coinsCounter++;
                    break;
                }
            }
        }
        System.out.println(coinsCounter);
    }
}
