package level3;

import java.util.Scanner;

public class BMICalculator {

    private static final int NUMBER_OF_PERSONS = 10;

    /**
     * Calculates BMI and status for a person.
     */
    public static String[] calculateBMIAndStatus(double weightKg, double heightCm) {

        double heightMeters = heightCm / 100.0;
        double bmi = weightKg / (heightMeters * heightMeters);

        // Round BMI to 2 decimals
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.valueOf(heightCm),
                String.valueOf(weightKg),
                String.valueOf(bmi),
                status
        };
    }

    /**
     * Computes BMI data for all persons.
     */
    public static String[][] computeBMIForAll(double[][] heightWeightData) {

        String[][] result = new String[heightWeightData.length][4];

        for (int i = 0; i < heightWeightData.length; i++) {

            double weight = heightWeightData[i][0];
            double height = heightWeightData[i][1];

            String[] bmiData = calculateBMIAndStatus(weight, height);

            result[i] = bmiData;
        }

        return result;
    }

    /**
     * Displays BMI table.
     */
    public static void displayBMITable(String[][] bmiData) {

        System.out.println("\nBMI Report");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {

            System.out.println((i + 1) + "\t" +
                    bmiData[i][0] + "\t\t" +
                    bmiData[i][1] + "\t\t" +
                    bmiData[i][2] + "\t\t" +
                    bmiData[i][3]);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double[][] heightWeightData = new double[NUMBER_OF_PERSONS][2];

            System.out.println("Enter height and weight for 10 persons:");

            for (int i = 0; i < NUMBER_OF_PERSONS; i++) {

                System.out.println("\nPerson " + (i + 1));

                System.out.print("Enter weight (kg): ");
                heightWeightData[i][0] = scanner.nextDouble();

                System.out.print("Enter height (cm): ");
                heightWeightData[i][1] = scanner.nextDouble();
            }

            String[][] bmiResults =
                    computeBMIForAll(heightWeightData);

            displayBMITable(bmiResults);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

