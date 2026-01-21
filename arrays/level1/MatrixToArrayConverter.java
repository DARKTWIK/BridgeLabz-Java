import java.util.Scanner;

/*
 * Program Name : MatrixToArrayConverter
 * Description  : Creates a 2D array using user input and copies its elements
 *                into a 1D array
 */
class MatrixToArrayConverter {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int rows = 0;
        int columns = 0;
        boolean isValidInput = false;

        /* ---------------- Input Rows and Columns with Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter number of rows: ");

            if (scanner.hasNextInt()) {

                rows = scanner.nextInt();

                if (rows > 0) {

                    System.out.print("Enter number of columns: ");

                    if (scanner.hasNextInt()) {

                        columns = scanner.nextInt();

                        if (columns > 0) {
                            isValidInput = true;
                        } else {
                            System.err.println("Error: Number of columns must be greater than 0.");
                        }

                    } else {
                        System.err.println("Error: Invalid input. Please enter a valid integer for columns.");
                        scanner.next();
                    }

                } else {
                    System.err.println("Error: Number of rows must be greater than 0.");
                }

            } else {
                System.err.println("Error: Invalid input. Please enter a valid integer for rows.");
                scanner.next();
            }
        }

        /* ---------------- Create 2D Array ---------------- */

        int[][] matrix = new int[rows][columns];

        /* ---------------- Input Matrix Elements ---------------- */

        System.out.println("\nEnter elements for the matrix:");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                boolean isValidElement = false;

                while (!isValidElement) {

                    System.out.print("Element at [" + i + "][" + j + "]: ");

                    if (scanner.hasNextInt()) {

                        matrix[i][j] = scanner.nextInt();
                        isValidElement = true;

                    } else {

                        System.err.println("Error: Invalid input. Please enter a valid integer.");
                        scanner.next();
                    }
                }
            }
        }

        /* ---------------- Create 1D Array ---------------- */

        int totalElements = rows * columns;
        int[] oneDimensionalArray = new int[totalElements];

        /* ---------------- Copy 2D Array to 1D Array ---------------- */

        int index = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                oneDimensionalArray[index] = matrix[i][j];
                index++;
            }
        }

        /* ---------------- Display 2D Array ---------------- */

        System.out.println("\n2D Array (Matrix):");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        /* ---------------- Display 1D Array ---------------- */

        System.out.println("\n1D Array:");

        for (int i = 0; i < oneDimensionalArray.length; i++) {
            System.out.print(oneDimensionalArray[i] + " ");
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
