package extras1;

import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static String removeCharacter(String text, char target) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);

            if (currentChar != target) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char characterToRemove = scanner.nextLine().charAt(0);

        String modifiedString = removeCharacter(input, characterToRemove);

        System.out.println("\nModified String: \"" + modifiedString + "\"");

        scanner.close();
    }
}

