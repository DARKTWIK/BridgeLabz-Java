import java.util.Scanner;

/*
 * Program Name : StudentVotingEligibility
 * Description  : Takes age of 10 students and checks their voting eligibility
 */
class StudentVotingEligibility {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int totalStudents = 10;
        int[] studentAges = new int[totalStudents];

        /* ---------------- Input Ages with Validation ---------------- */

        for (int i = 0; i < studentAges.length; i++) {

            boolean isValidAge = false;

            while (!isValidAge) {

                System.out.print("Enter age of student " + (i + 1) + ": ");

                // Validate integer input
                if (scanner.hasNextInt()) {

                    int ageInput = scanner.nextInt();

                    // Validate non-negative age
                    if (ageInput >= 0) {
                        studentAges[i] = ageInput;
                        isValidAge = true;
                    } else {
                        System.err.println("Error: Age cannot be negative. Please enter again.");
                    }

                } else {
                    System.err.println("Error: Invalid input. Please enter a valid integer age.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        /* ---------------- Check Voting Eligibility ---------------- */

        System.out.println("\n----- Voting Eligibility Result -----");

        for (int i = 0; i < studentAges.length; i++) {

            int currentAge = studentAges[i];

            // Check for invalid age (safety check)
            if (currentAge < 0) {

                System.out.println("Invalid age.");

            } 
            // Check if student can vote
            else if (currentAge >= 18) {

                System.out.println("The student with the age " + currentAge + " can vote.");

            } 
            // Student cannot vote
            else {

                System.out.println("The student with the age " + currentAge + " cannot vote.");
            }
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
