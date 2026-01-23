package level2;

import java.util.Scanner;

public class PalindromeChecker {

    // Method to take input from user
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method to display the result
    public static void displayResult(String text, boolean isPalindrome) {

        if (isPalindrome) {
            System.out.println("\n\"" + text + "\" is a PALINDROME.");
        } else {
            System.out.println("\n\"" + text + "\" is NOT a palindrome.");
        }
    }

    // Main method
    public static void main(String[] args) {

        String inputText = getUserInput();

        boolean result = isPalindrome(inputText);

        displayResult(inputText, result);
    }
}

