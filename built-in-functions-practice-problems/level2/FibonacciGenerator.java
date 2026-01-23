package level2;

import java.util.Scanner;

public class FibonacciGenerator {

    // Method to calculate and print Fibonacci sequence
    public static void printFibonacciSequence(int terms) {

        if (terms <= 0) {
            System.out.println("Number of terms must be positive.");
            return;
        }

        long first = 0;
        long second = 1;

        System.out.println("\nFibonacci Sequence:");

        if (terms >= 1) {
            System.out.print(first);
        }

        if (terms >= 2) {
            System.out.print(" " + second);
        }

        for (int i = 3; i <= terms; i++) {

            long next = first + second;
            System.out.print(" " + next);

            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int numberOfTerms = scanner.nextInt();

        printFibonacciSequence(numberOfTerms);

        scanner.close();
    }
}

