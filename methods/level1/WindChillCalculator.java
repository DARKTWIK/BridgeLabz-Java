package level1;

import java.util.Scanner;

/*
 * Program Name : WindChillCalculator
 * Description  : Calculates wind chill temperature based on temperature and wind speed
 */
class WindChillCalculator {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        double temperature = 0.0;
        double windSpeed = 0.0;

        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter temperature (in Fahrenheit): ");

            if (!scanner.hasNextDouble()) {
                System.err.println("Invalid temperature value.");
                scanner.next();
                continue;
            }
            temperature = scanner.nextDouble();

            System.out.print("Enter wind speed (in mph): ");

            if (!scanner.hasNextDouble()) {
                System.err.println("Invalid wind speed value.");
                scanner.next();
                continue;
            }
            windSpeed = scanner.nextDouble();

            if (windSpeed < 0) {
                System.err.println("Wind speed must be a non-negative value.");
                continue;
            }

            isValidInput = true;
        }

        /* ---------------- Wind Chill Calculation ---------------- */

        double windChill = calculateWindChill(temperature, windSpeed);

        /* ---------------- Display Result ---------------- */

        System.out.printf("%nWind Chill Temperature = %.2f%n", windChill);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : calculateWindChill
     * Description  : Calculates wind chill temperature using the standard formula
     * Parameters   : temperature, windSpeed
     * Return Type  : double
     */
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill =
                35.74
                        + (0.6215 * temperature)
                        + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));

        return windChill;
    }
}

