package level2;

import java.util.Scanner;

public class FactorialUsingRecursion {

    // Method to take input from user
    public static int getUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    // Recursive method to calculate factorial
    public static long factorial(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    // Method to display result
    public static void displayResult(int number, long result) {
        System.out.println("\nFactorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {

        try {

            int inputNumber = getUserInput();

            long result = factorial(inputNumber);

            displayResult(inputNumber, result);

        } catch (IllegalArgumentException exception) {

            System.out.println("Error: " + exception.getMessage());

        } catch (Exception exception) {

            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
