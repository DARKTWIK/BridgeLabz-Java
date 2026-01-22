package level3;

import java.util.Scanner;

public class PalindromeChecker {

    /* -------------------------------------------------
       Logic 1: Iterative method using charAt()
       ------------------------------------------------- */
    public static boolean isPalindromeIterative(String text) {

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

    /* -------------------------------------------------
       Logic 2: Recursive method
       ------------------------------------------------- */
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    /* -------------------------------------------------
       Reverse string using charAt()
       ------------------------------------------------- */
    public static char[] reverseStringUsingCharAt(String text) {

        int length = text.length();
        char[] reverseArray = new char[length];

        int index = 0;

        for (int i = length - 1; i >= 0; i--) {
            reverseArray[index++] = text.charAt(i);
        }

        return reverseArray;
    }

    /* -------------------------------------------------
       Logic 3: Character array comparison
       ------------------------------------------------- */
    public static boolean isPalindromeUsingCharArray(String text) {

        char[] originalArray = text.toCharArray();
        char[] reverseArray = reverseStringUsingCharAt(text);

        for (int i = 0; i < originalArray.length; i++) {

            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }

        return true;
    }

    /* -------------------------------------------------
       Main Method
       ------------------------------------------------- */
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the text: ");
            String inputText = scanner.nextLine();

            boolean resultLogic1 = isPalindromeIterative(inputText);
            boolean resultLogic2 = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
            boolean resultLogic3 = isPalindromeUsingCharArray(inputText);

            System.out.println("\nPalindrome Check Results:");
            System.out.println("--------------------------------");
            System.out.println("Logic 1 (Iterative)   : " + resultLogic1);
            System.out.println("Logic 2 (Recursive)   : " + resultLogic2);
            System.out.println("Logic 3 (Char Array)  : " + resultLogic3);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}
