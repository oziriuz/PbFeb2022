package Softuniada2021;

import java.util.*;

public class YachtVisited {
    public static boolean isOk = false;

    public static int stepBackward(int position, int maxPosition, int[] path, int min, int max, int target, int current, HashSet<String> deadEnd) {
        String key = String.valueOf(position) + ',' + current;

        if (current == target && position == maxPosition) {
            isOk = true;
            return target;
        } else if (position == maxPosition) {
            return -1;
        }

        if (isOk) {
            return current;
        }
        if(deadEnd.contains(key)) {
            return -1;
        }
        if (current < min || current > max) {
            return -1;
        }

        if (current + path[position] <= max) {
            if (current == stepBackward(position + 1, maxPosition, path, min, max, target, current + path[position], deadEnd)) {
                return current;
            }
        }
        if (current - path[position] >= min) {
            if (current == stepBackward(position + 1, maxPosition, path, min, max, target, current - path[position], deadEnd)) {
                return current;
            }
        }
        deadEnd.add(key);

        if (isOk) {
            return current;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = -1;
        int numberOfPoints = Integer.parseInt(scanner.nextLine().trim());
        List<String> numberForGrid = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split(" ")));

        int[] grid = new int[numberOfPoints];
        int initialSpeed = Integer.parseInt(scanner.nextLine().trim());
        int upperLimit = Integer.parseInt(scanner.nextLine().trim());
        int lowerLimit = 0;

        Collections.reverse(numberForGrid);
        for (int i = 0; i < grid.length; i++) {
            int temp = Integer.parseInt(numberForGrid.get(i));
            if (temp > upperLimit || temp < lowerLimit) {
                System.out.println(-1);
                return;
            }
            grid[i] = temp;
        }

        if (initialSpeed - grid[grid.length - 1] < lowerLimit && initialSpeed + grid[grid.length - 1] > upperLimit) {
            System.out.println(-1);
            return;
        }

        HashSet<String> deadEnd = new HashSet<>();
        //long cur= System.nanoTime();
        for (int temp = upperLimit; temp >= lowerLimit; temp--) {
            result = stepBackward(0, numberOfPoints, grid, lowerLimit, upperLimit, initialSpeed, temp, deadEnd);
            if (result != -1) {
                break;
            }
        }
        //long c1 = System.nanoTime()-cur;
        //System.out.println("TIME CONSUMED:" +c1);
        System.out.println(result);
    }
}
