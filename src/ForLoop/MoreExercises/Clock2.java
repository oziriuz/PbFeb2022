package ForLoop.MoreExercises;

public class Clock2 {
    public static void main(String[] args) {
        for (int i = 0; i < 24*60*60; i++) {
            int hours = i / 3600;
            int minutes = (i % 3600) / 60;
            int second = i % 60;
            System.out.printf("%d : %d : %d%n", hours, minutes, second);
        }
    }
}
