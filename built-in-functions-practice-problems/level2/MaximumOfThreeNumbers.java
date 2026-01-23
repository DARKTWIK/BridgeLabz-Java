package level2;

import java.util.Scanner;

public class MaximumOfThreeNumbers {

    // Method to take input from user
    public static int[] getUserInputs() {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = scanner.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = scanner.nextInt();

        System.out.print("Enter third number: ");
        numbers[2] = scanner.nextInt();

        return numbers;
    }

    // Method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    // Method to display result
    public static void displayResult(int max) {
        System.out.println("\nMaximum value is: " + max);
    }

    public static void main(String[] args) {

        int[] numbers = getUserInputs();

        int maximum = findMaximum(numbers[0], numbers[1], numbers[2]);

        displayResult(maximum);
    }
}

