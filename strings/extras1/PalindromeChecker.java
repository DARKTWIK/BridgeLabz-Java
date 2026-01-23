package extras1;

import java.util.Scanner;

public class PalindromeChecker {

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("\nThe string is a PALINDROME.");
        } else {
            System.out.println("\nThe string is NOT a palindrome.");
        }

        scanner.close();
    }
}

