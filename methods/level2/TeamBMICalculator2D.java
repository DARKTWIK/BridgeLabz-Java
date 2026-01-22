package level2;

import java.util.Scanner;

/*
 * Program Name : TeamBMICalculator2D
 * Description  : Calculates BMI and BMI status for a team of 10 members
 *                using a 2D array
 */
public class TeamBMICalculator2D {

    private static final int TOTAL_MEMBERS = 10;
    private static final int WEIGHT_COL = 0;
    private static final int HEIGHT_COL = 1;
    private static final int BMI_COL = 2;

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        double[][] personData = new double[TOTAL_MEMBERS][3];

        /* ---------------- Input Weight & Height ---------------- */

        for (int i = 0; i < personData.length; i++) {

            boolean isValidInput = false;

            while (!isValidInput) {

                System.out.println("\nEnter details for Person " + (i + 1));

                // Weight input
                System.out.print("Weight (kg): ");
                if (!scanner.hasNextDouble()) {
                    System.err.println("Invalid weight. Enter numeric value.");
                    scanner.next();
                    continue;
                }

                double weight = scanner.nextDouble();

                // Height input
                System.out.print("Height (cm): ");
                if (!scanner.hasNextDouble()) {
                    System.err.println("Invalid height. Enter numeric value.");
                    scanner.next();
                    continue;
                }

                double height = scanner.nextDouble();

                if (weight <= 0 || height <= 0) {
                    System.err.println("Weight and height must be positive values.");
                    continue;
                }

                personData[i][WEIGHT_COL] = weight;
                personData[i][HEIGHT_COL] = height;

                isValidInput = true;
            }
        }

        /* ---------------- Calculate BMI ---------------- */

        calculateBMI(personData);

        /* ---------------- Determine BMI Status ---------------- */

        String[] bmiStatus = determineBMIStatus(personData);

        /* ---------------- Display Result ---------------- */

        System.out.println("\n================ BMI REPORT ================");

        for (int i = 0; i < personData.length; i++) {

            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight (kg): " + personData[i][WEIGHT_COL]);
            System.out.println("Height (cm): " + personData[i][HEIGHT_COL]);
            System.out.printf("BMI        : %.2f%n", personData[i][BMI_COL]);
            System.out.println("Status     : " + bmiStatus[i]);
        }

        System.out.println("\n===========================================");

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : calculateBMI
     * Description  : Calculates BMI for each person and populates the 3rd column
     */
    public static void calculateBMI(double[][] personData) {

        for (int i = 0; i < personData.length; i++) {

            double weightKg = personData[i][WEIGHT_COL];
            double heightCm = personData[i][HEIGHT_COL];

            // Convert cm to meters
            double heightMeters = heightCm / 100.0;

            // BMI calculation
            double bmi = weightKg / (heightMeters * heightMeters);

            personData[i][BMI_COL] = bmi;
        }
    }

    /*
     * Method Name  : determineBMIStatus
     * Description  : Determines BMI status for all persons
     * Return Type  : String[] (status of each person)
     */
    public static String[] determineBMIStatus(double[][] personData) {

        String[] statusArray = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {

            double bmi = personData[i][BMI_COL];

            if (bmi <= 18.4) {
                statusArray[i] = "Underweight";
            }
            else if (bmi <= 24.9) {
                statusArray[i] = "Normal";
            }
            else if (bmi <= 39.9) {
                statusArray[i] = "Overweight";
            }
            else {
                statusArray[i] = "Obese";
            }
        }

        return statusArray;
    }
}

