package extras1;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static int[] countVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Convert uppercase to lowercase using ASCII
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            // Check if letter
            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] result = countVowelsAndConsonants(input);

        System.out.println("\nVowels     : " + result[0]);
        System.out.println("Consonants : " + result[1]);

        scanner.close();
    }
}

