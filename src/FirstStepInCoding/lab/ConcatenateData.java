package FirstStepInCoding.lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You are <firstName> <lastName> a <age> age-years old person from <town>.;
        String firstName;
        String lastName;
        int age;
        String town;

        firstName = scanner.nextLine();
        lastName = scanner.nextLine();
        age = Integer.parseInt(scanner.nextLine());
        town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}
