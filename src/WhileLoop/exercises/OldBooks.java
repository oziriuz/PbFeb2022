package WhileLoop.exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seekBook = scanner.nextLine();
        String nextBook = scanner.nextLine();
        int numberOfBooks = 0;

        while (!nextBook.equals(seekBook)){
            if (nextBook.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", numberOfBooks);
                return;
            }
            numberOfBooks++;
            nextBook = scanner.nextLine();
        }
        System.out.printf("You checked %d books and found it.", numberOfBooks);
    }
}
