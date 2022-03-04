package ForLoop.MoreExercises;

public class Clock {
    public static void main(String[] args) {
        for (int i = 0; i < 24*60; i++) {
            int hours = i / 60;
            int minutes = i % 60;
            System.out.printf("%d : %d%n", hours, minutes);
        }
    }
}
