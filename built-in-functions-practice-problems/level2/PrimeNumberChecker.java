package level2;

import java.util.Scanner;

public class PrimeNumberChecker {

    // Method to check whether a number is prime
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Main method for input and output
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        boolean result = isPrime(inputNumber);

        if (result) {
            System.out.println(inputNumber + " is a PRIME number.");
        } else {
            System.out.println(inputNumber + " is NOT a prime number.");
        }

        scanner.close();
    }
}

