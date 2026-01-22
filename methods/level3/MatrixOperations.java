package level3;

/*
 * Program Name : MatrixOperations
 * Description  : Performs matrix addition, subtraction, multiplication,
 *                transpose, determinant and inverse (2x2 & 3x3)
 */
public class MatrixOperations {

    public static void main(String[] args) {

        /* ---------------- Create Random Matrices ---------------- */

        double[][] matrixA2 = createRandomMatrix(2, 2);
        double[][] matrixB2 = createRandomMatrix(2, 2);

        double[][] matrixA3 = createRandomMatrix(3, 3);
        double[][] matrixB3 = createRandomMatrix(3, 3);

        System.out.println("\nMatrix A (2x2):");
        displayMatrix(matrixA2);

        System.out.println("\nMatrix B (2x2):");
        displayMatrix(matrixB2);

        System.out.println("\nAddition (2x2):");
        displayMatrix(addMatrices(matrixA2, matrixB2));

        System.out.println("\nSubtraction (2x2):");
        displayMatrix(subtractMatrices(matrixA2, matrixB2));

        System.out.println("\nMultiplication (2x2):");
        displayMatrix(multiplyMatrices(matrixA2, matrixB2));

        System.out.println("\nTranspose of Matrix A (2x2):");
        displayMatrix(transposeMatrix(matrixA2));

        double det2 = determinant2x2(matrixA2);
        System.out.println("\nDeterminant (2x2): " + det2);

        if (det2 != 0) {
            System.out.println("\nInverse of Matrix A (2x2):");
            displayMatrix(inverse2x2(matrixA2));
        }

        System.out.println("\nMatrix A (3x3):");
        displayMatrix(matrixA3);

        double det3 = determinant3x3(matrixA3);
        System.out.println("\nDeterminant (3x3): " + det3);

        if (det3 != 0) {
            System.out.println("\nInverse of Matrix A (3x3):");
            displayMatrix(inverse3x3(matrixA3));
        }
    }

    /* ---------------- Matrix Creation ---------------- */

    public static double[][] createRandomMatrix(int rows, int cols) {

        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10) + 1; // 1–10
            }
        }
        return matrix;
    }

    /* ---------------- Matrix Display ---------------- */

    public static void displayMatrix(double[][] matrix) {

        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }

    /* ---------------- Matrix Addition ---------------- */

    public static double[][] addMatrices(double[][] A, double[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    /* ---------------- Matrix Subtraction ---------------- */

    public static double[][] subtractMatrices(double[][] A, double[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    /* ---------------- Matrix Multiplication ---------------- */

    public static double[][] multiplyMatrices(double[][] A, double[][] B) {

        int rows = A.length;
        int cols = B[0].length;
        int common = B.length;

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += A[i][k] * B[k][j];

        return result;
    }

    /* ---------------- Transpose ---------------- */

    public static double[][] transposeMatrix(double[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];

        return transpose;
    }

    /* ---------------- Determinant 2x2 ---------------- */

    public static double determinant2x2(double[][] m) {

        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    /* ---------------- Determinant 3x3 ---------------- */

    public static double determinant3x3(double[][] m) {

        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    /* ---------------- Inverse 2x2 ---------------- */

    public static double[][] inverse2x2(double[][] m) {

        double det = determinant2x2(m);

        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    /* ---------------- Inverse 3x3 ---------------- */

    public static double[][] inverse3x3(double[][] m) {

        double det = determinant3x3(m);

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1] = -(m[0][1]*m[2][2]-m[0][2]*m[2][1])/det;
        inv[0][2] =  (m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;

        inv[1][0] = -(m[1][0]*m[2][2]-m[1][2]*m[2][0])/det;
        inv[1][1] =  (m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2] = -(m[0][0]*m[1][2]-m[0][2]*m[1][0])/det;

        inv[2][0] =  (m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1] = -(m[0][0]*m[2][1]-m[0][1]*m[2][0])/det;
        inv[2][2] =  (m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;

        return inv;
    }
}

