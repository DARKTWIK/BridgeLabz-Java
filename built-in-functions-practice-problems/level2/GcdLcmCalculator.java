package level2;

import java.util.Scanner;

public class GcdLcmCalculator {

    // Method to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return Math.abs(a);
    }

    // Method to calculate LCM using GCD
    public static int calculateLCM(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        }

        return Math.abs(a * b) / calculateGCD(a, b);
    }

    // Method to take user input
    public static int[] getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        return new int[]{first, second};
    }

    // Method to display result
    public static void displayResult(int a, int b, int gcd, int lcm) {

        System.out.println("\nNumbers: " + a + " and " + b);
        System.out.println("GCD     : " + gcd);
        System.out.println("LCM     : " + lcm);
    }

    public static void main(String[] args) {

        try {

            int[] numbers = getUserInput();

            int gcd = calculateGCD(numbers[0], numbers[1]);
            int lcm = calculateLCM(numbers[0], numbers[1]);

            displayResult(numbers[0], numbers[1], gcd, lcm);

        } catch (Exception exception) {

            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}

