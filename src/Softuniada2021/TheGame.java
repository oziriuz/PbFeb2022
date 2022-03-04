package Softuniada2021;
// Java program to find minimum number of
// operations required to transform one
// string to other

import java.util.*;

public class TheGame {

    // Function to find minimum number of
    // operations required to transform
    // inString to targetString.
    public static int minOps(String mixedString, String targetString) {

        // This parts checks whether conversion is
        // possible or not by comparing length
        if (mixedString.length() != targetString.length())
            return -1;

        //compare if the letter in mixedString and targetString are same
        //create an array to 256 (ascii symbols)
        int i, j, res = 0;
        int[] count = new int[256];

        // count characters in inString

        // subtract count for every character in targetString
        for (i = 0; i < mixedString.length(); i++) {
            //and the mixedString puts 1 for every occurrence if the char we are at
            count[mixedString.charAt(i)]++;
            //then the targetString remove 1 for every occurrence if the char we are at
            count[targetString.charAt(i)]--;
        }

        // Check if all counts become 0
        // if it is zero then they match and can be converted
        for (i = 0; i < 255; i++)
            if (count[i] != 0)
                //they do not match in chars
                return -1;

        i = mixedString.length() - 1;
        j = targetString.length() - 1;

        while (i >= 0) {
            // If there is a mismatch, then
            // keep incrementing result 'res'
            // until targetString[j] is not found in inString[0..i]
            if (mixedString.charAt(i) != targetString.charAt(j))
                res++;
            else
                j--;
            i--;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String target = scanner.nextLine();
        int result = minOps(input, target);
        if (result >= 0) {
            System.out.printf("The minimum operations required to convert \"%s\" to \"%s\" are %d", input, target, result);
        } else {
            System.out.println("The name cannot be transformed!");
        }
    }
}