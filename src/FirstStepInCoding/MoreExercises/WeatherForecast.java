package FirstStepInCoding.MoreExercises;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather;

        weather = scanner.nextLine();

        if (weather.equals("sunny"))
            System.out.println("It's warm outside!");
        else
            System.out.println("It's cold outside!");
    }
}
