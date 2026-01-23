package extras1;

import java.util.Scanner;

public class SubstringOccurenceCounter {

    public static int countOccurrences(String text, String pattern) {

        if (pattern.length() == 0 || text.length() < pattern.length()) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i <= text.length() - pattern.length(); i++) {

            boolean match = true;

            for (int j = 0; j < pattern.length(); j++) {

                if (text.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = scanner.nextLine();

        System.out.print("Enter the substring to search: ");
        String pattern = scanner.nextLine();

        int occurrences = countOccurrences(text, pattern);

        System.out.println("\nNumber of occurrences: " + occurrences);

        scanner.close();
    }
}

