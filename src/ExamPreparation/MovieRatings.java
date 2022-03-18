package ExamPreparation;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой филми, които си е набелязала Деси – цяло число в интервала [1…20]
        //За всеки филм се прочитат два отделни реда:
        //•	Име на филма – текст
        //•	Рейтинг на филма - реално число в интервала [1.00…10.00]

        int numberOfMovies = Integer.parseInt(scanner.nextLine());

        double ratingMax = Double.MIN_VALUE;
        double ratingMin = Double.MAX_VALUE;
        String movieMin = "";
        String movieMax = "";
        double ratingSum = 0;

        for (int i = 0; i < numberOfMovies; i++) {
            String movie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            ratingSum += rating;

            if (rating > ratingMax) {
                ratingMax = rating;
                movieMax = movie;
            }
            if (rating < ratingMin) {
                ratingMin = rating;
                movieMin = movie;
            }
        }

        double averageRating = ratingSum / numberOfMovies;

        System.out.printf("%s is with highest rating: %.1f%n", movieMax, ratingMax);
        System.out.printf("%s is with lowest rating: %.1f%n", movieMin, ratingMin);
        System.out.printf("Average rating: %.1f%n", averageRating);

    }
}
