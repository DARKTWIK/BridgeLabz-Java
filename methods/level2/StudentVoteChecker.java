package level2;

import java.util.Scanner;

/*
 * Program Name : StudentVoteChecker
 * Description  : Checks voting eligibility of 10 students based on age
 */
public class StudentVoteChecker {

    /*
     * Method Name  : canStudentVote
     * Description  : Determines whether a student can vote based on age
     * Parameter    : age (int)
     * Return Type  : boolean
     */
    public boolean canStudentVote(int age) {

        // Validate negative age
        if (age < 0) {
            return false;
        }

        // Check voting eligibility
        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int totalStudents = 10;
        int[] studentAges = new int[totalStudents];

        StudentVoteChecker checker = new StudentVoteChecker();

        /* ---------------- Input Ages and Check Voting Eligibility ---------------- */

        for (int i = 0; i < studentAges.length; i++) {

            boolean isValidInput = false;

            while (!isValidInput) {

                System.out.print("Enter age of student " + (i + 1) + ": ");

                if (scanner.hasNextInt()) {

                    int ageInput = scanner.nextInt();

                    if (ageInput < 0) {
                        System.err.println("Invalid age. Age cannot be negative. Please enter again.");
                        continue;
                    }

                    studentAges[i] = ageInput;
                    isValidInput = true;

                } else {

                    System.err.println("Invalid input. Please enter a valid integer age.");
                    scanner.next(); // Clear invalid input
                }
            }

            // Check voting eligibility
            boolean canVote = checker.canStudentVote(studentAges[i]);

            // Display result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }

            System.out.println();
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}

