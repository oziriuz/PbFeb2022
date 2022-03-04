package Softuniada2022;

import java.util.*;

public class SortedArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> listElements = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split(" ")));

        List<Integer> listInt = new ArrayList<>();

        for (String listElement : listElements) {
            listInt.add(Integer.valueOf(listElement));
        }

        for (int i = 1; i < n; i++) {
            if (listInt.get(i) >= listInt.get(i - 1) && i % 2 != 0) {
                Collections.swap(listInt, i, i - 1);
            }
            if (listInt.get(i) <= listInt.get(i - 1) && i % 2 == 0) {
                Collections.swap(listInt, i, i - 1);
            }
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            output.append(" ").append(listInt.get(i));
        }

        System.out.println(output.toString().trim());
    }
}
