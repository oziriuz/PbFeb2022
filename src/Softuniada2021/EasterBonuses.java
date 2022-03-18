package Softuniada2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EasterBonuses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int bonus;
        boolean hasZero = false;
        int bonusSum = 0;
        List<String> list = new ArrayList<>();
        List<String> tasks = new ArrayList<>();
        List<Integer> bonuses = new ArrayList<>();

        while (true) {
            name = scanner.nextLine();
            if (name.equals("stop"))
                break;
            tasks.addAll(Arrays.asList(scanner.nextLine().split(", ")));
            int temp = 1;
            for (String s : tasks) {
                if (s.equals("0") && !hasZero) {
                    hasZero = true;
                } else {
                    temp = temp * Integer.parseInt(s);
                }
            }
            int tempSum = 0;
            if (!hasZero) {
                for (String task : tasks) {
                    tempSum = tempSum + temp / Integer.parseInt(task);
                }
            } else {
                tempSum = temp;
            }
            hasZero = false;
            tasks.clear();
            list.add(name);
            bonus = tempSum;
            bonuses.add(bonus);
            bonusSum = bonusSum + bonus;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s has a bonus of %d lv.", list.get(i), bonuses.get(i));
            System.out.println();
        }
        System.out.printf("The amount of all bonuses is %d lv.", bonusSum);
    }
}
