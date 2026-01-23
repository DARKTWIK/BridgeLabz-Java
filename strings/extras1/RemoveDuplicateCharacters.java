package extras1;

import java.util.Scanner;

public class RemoveDuplicateCharacters {

    public static String removeDuplicates(String text) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);
            boolean isDuplicate = false;

            // Check if character already exists in result
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String modifiedString = removeDuplicates(input);

        System.out.println("\nString after removing duplicates:");
        System.out.println(modifiedString);

        scanner.close();
    }
}

