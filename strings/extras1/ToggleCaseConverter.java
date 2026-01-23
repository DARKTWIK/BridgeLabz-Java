package extras1;

import java.util.Scanner;

public class ToggleCaseConverter {

    public static String toggleCase(String text) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            }
            // Lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            }
            // Other characters remain unchanged
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String toggled = toggleCase(input);

        System.out.println("\nToggled case string:");
        System.out.println(toggled);

        scanner.close();
    }
}

