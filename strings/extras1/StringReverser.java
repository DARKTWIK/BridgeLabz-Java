package extras1;

import java.util.Scanner;

public class StringReverser {

    public static String reverseString(String text) {

        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedText = reverseString(input);

        System.out.println("\nOriginal String : " + input);
        System.out.println("Reversed String : " + reversedText);

        scanner.close();
    }
}
