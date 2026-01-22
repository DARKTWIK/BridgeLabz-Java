package level3;

/*
 * Program Name : ZaraBonusCalculator
 * Description  : Calculates bonus and new salary for 10 employees of Zara
 */
public class ZaraBonusCalculator {

    private static final int TOTAL_EMPLOYEES = 10;

    public static void main(String[] args) {

        /* -------- Generate salary & service data -------- */

        double[][] oldData = generateSalaryAndServiceData();

        /* -------- Calculate bonus & new salary -------- */

        double[][] newData = calculateBonusAndNewSalary(oldData);

        /* -------- Display summary -------- */

        displaySalarySummary(oldData, newData);
    }

    /*
     * Generates salary and years of service
     * Returns 2D array:
     * [][0] -> salary
     * [][1] -> years of service
     */
    public static double[][] generateSalaryAndServiceData() {

        double[][] data = new double[TOTAL_EMPLOYEES][2];

        for (int i = 0; i < data.length; i++) {

            // Generate 5-digit salary (10000 - 99999)
            double salary = (int) (Math.random() * 90000) + 10000;

            // Generate years of service (1 - 10)
            double years = (int) (Math.random() * 10) + 1;

            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }

    /*
     * Calculates bonus and new salary
     * Returns 2D array:
     * [][0] -> new salary
     * [][1] -> bonus
     */
    public static double[][] calculateBonusAndNewSalary(double[][] oldData) {

        double[][] result = new double[TOTAL_EMPLOYEES][2];

        for (int i = 0; i < oldData.length; i++) {

            double salary = oldData[i][0];
            double years = oldData[i][1];

            double bonusRate;

            if (years > 5) {
                bonusRate = 0.05;   // 5%
            } else {
                bonusRate = 0.02;   // 2%
            }

            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    /*
     * Displays tabular summary and totals
     */
    public static void displaySalarySummary(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("\n================ ZARA EMPLOYEE BONUS REPORT ================");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n",
                "EmpID", "Old Salary", "Years", "Bonus", "New Salary");

        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {

            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15.2f %-15.0f %-15.2f %-15.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("------------------------------------------------------------");

        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f%n",
                "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);

        System.out.println("============================================================");
    }
}

