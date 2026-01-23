package level2;

import java.util.Scanner;

public class BasicCalculator {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return a / b;
    }

    // Take number input
    public static double getNumber(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    // Display result
    public static void displayResult(double result) {
        System.out.println("\nResult: " + result);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Basic Calculator");
            System.out.println("----------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Choose an operation (1-4): ");
            int choice = scanner.nextInt();

            double num1 = getNumber(scanner, "Enter first number: ");
            double num2 = getNumber(scanner, "Enter second number: ");

            double result;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation choice.");
                    return;
            }

            displayResult(result);

        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}

