package level2;

import java.util.Random;
import java.util.Scanner;

public class StudentScorecardGenerator {

    private static final int MIN_MARKS = 10;
    private static final int MAX_MARKS = 99;

    /* Generate random 2-digit PCM scores */
    public static int[][] generateRandomPCMScores(int numberOfStudents) {

        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(MAX_MARKS - MIN_MARKS + 1) + MIN_MARKS;
            scores[i][1] = random.nextInt(MAX_MARKS - MIN_MARKS + 1) + MIN_MARKS;
            scores[i][2] = random.nextInt(MAX_MARKS - MIN_MARKS + 1) + MIN_MARKS;
        }

        return scores;
    }

    /* Calculate total, average, percentage */
    public static double[][] calculateTotalsAndPercentages(int[][] pcmScores) {

        double[][] results = new double[pcmScores.length][3]; // total, average, percentage

        for (int i = 0; i < pcmScores.length; i++) {

            int total = pcmScores[i][0] + pcmScores[i][1] + pcmScores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimals
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    /* Calculate grade based on percentage */
    public static String[][] calculateGrades(double[][] percentageData) {

        String[][] grades = new String[percentageData.length][1];

        for (int i = 0; i < percentageData.length; i++) {

            double percentage = percentageData[i][2];
            String grade;

            if (percentage >= 90) grade = "A+";
            else if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B";
            else if (percentage >= 60) grade = "C";
            else if (percentage >= 50) grade = "D";
            else grade = "F";

            grades[i][0] = grade;
        }

        return grades;
    }

    /* Display scorecard */
    public static void displayScorecard(int[][] pcmScores,
                                        double[][] calculations,
                                        String[][] grades) {

        System.out.println("\nStudent Scorecard");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < pcmScores.length; i++) {

            System.out.println((i + 1) + "\t\t" +
                    pcmScores[i][0] + "\t\t" +
                    pcmScores[i][1] + "\t\t" +
                    pcmScores[i][2] + "\t" +
                    (int) calculations[i][0] + "\t" +
                    calculations[i][1] + "\t" +
                    calculations[i][2] + "%\t\t" +
                    grades[i][0]);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of students: ");
            int numberOfStudents = scanner.nextInt();

            int[][] pcmScores =
                    generateRandomPCMScores(numberOfStudents);

            double[][] totalsAndPercentages =
                    calculateTotalsAndPercentages(pcmScores);

            String[][] grades =
                    calculateGrades(totalsAndPercentages);

            displayScorecard(pcmScores, totalsAndPercentages, grades);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}
