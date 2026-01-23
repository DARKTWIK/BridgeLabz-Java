package level2;

import java.util.Scanner;

public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Take user input
    public static double getTemperatureInput(Scanner scanner) {
        System.out.print("Enter the temperature value: ");
        return scanner.nextDouble();
    }

    // Display result
    public static void displayResult(double input, double output, String conversionType) {
        System.out.printf("\n%.2f %s = %.2f %s\n",
                input,
                conversionType.equals("FtoC") ? "°F" : "°C",
                output,
                conversionType.equals("FtoC") ? "°C" : "°F");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Temperature Converter");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.print("Choose conversion type (1 or 2): ");

            int choice = scanner.nextInt();

            double inputTemp = getTemperatureInput(scanner);
            double result;

            if (choice == 1) {
                result = fahrenheitToCelsius(inputTemp);
                displayResult(inputTemp, result, "FtoC");
            }
            else if (choice == 2) {
                result = celsiusToFahrenheit(inputTemp);
                displayResult(inputTemp, result, "CtoF");
            }
            else {
                System.out.println("Invalid choice.");
            }

        } catch (Exception exception) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}

