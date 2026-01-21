import java.util.Scanner;

/*
 * Program Name : ZaraEmployeeBonusCalculator
 * Description  : Calculates bonus, new salary, and total bonus payout
 *                for 10 employees based on years of service
 */
class ZaraEmployeeBonusCalculator {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int totalEmployees = 10;

        double[] salaries = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] bonusAmounts = new double[totalEmployees];
        double[] newSalaries = new double[totalEmployees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        /* ---------------- User Input with Validation ---------------- */

        for (int i = 0; i < salaries.length; i++) {

            boolean isValidInput = false;

            while (!isValidInput) {

                System.out.println("\nEnter details for Employee " + (i + 1));

                System.out.print("Salary: ");
                boolean isSalaryValid = scanner.hasNextDouble();

                if (!isSalaryValid) {
                    System.err.println("Error: Invalid salary. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                    continue;
                }

                double salaryInput = scanner.nextDouble();

                System.out.print("Years of Service: ");
                boolean isServiceValid = scanner.hasNextDouble();

                if (!isServiceValid) {
                    System.err.println("Error: Invalid years of service. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                    continue;
                }

                double serviceInput = scanner.nextDouble();

                // Validate positive values
                if (salaryInput <= 0 || serviceInput < 0) {
                    System.err.println("Error: Salary must be positive and years of service cannot be negative.");
                    continue;
                }

                // Store valid values
                salaries[i] = salaryInput;
                yearsOfService[i] = serviceInput;
                isValidInput = true;
            }
        }

        /* ---------------- Bonus Calculation ---------------- */

        for (int i = 0; i < salaries.length; i++) {

            double bonusPercentage;

            // Determine bonus percentage
            if (yearsOfService[i] > 5) {
                bonusPercentage = 0.05; // 5%
            } else {
                bonusPercentage = 0.02; // 2%
            }

            // Calculate bonus and new salary
            bonusAmounts[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonusAmounts[i];

            // Update totals
            totalBonus += bonusAmounts[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        /* ---------------- Display Final Results ---------------- */

        System.out.println("\n========== Zara Bonus Summary ==========");

        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salaries[i] +
                    " | Bonus: " + bonusAmounts[i] +
                    " | New Salary: " + newSalaries[i]);
        }

        System.out.println("\n----------------------------------------");
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
