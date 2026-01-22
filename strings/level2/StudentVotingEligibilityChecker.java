package level2;

import java.util.Random;
import java.util.Scanner;

public class StudentVotingEligibilityChecker {

    private static final int MIN_AGE = 10;
    private static final int MAX_AGE = 99;

    /**
     * Generates random 2-digit ages for given number of students.
     */
    public static int[] generateRandomStudentAges(int numberOfStudents) {

        Random random = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(MAX_AGE - MIN_AGE + 1) + MIN_AGE;
        }

        return ages;
    }

    /**
     * Creates a 2D array of age and voting eligibility.
     */
    public static String[][] evaluateVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];
            boolean canVote = false;

            if (age >= 0 && age >= 18) {
                canVote = true;
            }

            result[i][0] = String.valueOf(age);
            result[i][1] = String.valueOf(canVote);
        }

        return result;
    }

    /**
     * Displays the 2D array in tabular format.
     */
    public static void displayVotingTable(String[][] table) {

        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println("----------------------------");

        for (int i = 0; i < table.length; i++) {

            int age = Integer.parseInt(table[i][0]);
            boolean canVote = Boolean.parseBoolean(table[i][1]);

            System.out.println((i + 1) + "\t" + age + "\t" + canVote);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int numberOfStudents = 10;

            System.out.println("Generating ages for " + numberOfStudents + " students...\n");

            int[] studentAges =
                    generateRandomStudentAges(numberOfStudents);

            String[][] votingResults =
                    evaluateVotingEligibility(studentAges);

            displayVotingTable(votingResults);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

