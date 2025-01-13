public class MatrixOperations {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
		
		// Creating matrix
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

		// Printing matrix
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

		// Performing addition
        System.out.println("\nAddition:");
        int[][] sum = addMatrices(matrix1, matrix2);
        if (sum != null) {
            displayMatrix(sum);
        }

		// Showing difference
        System.out.println("\nSubtraction:");
        int[][] difference = subtractMatrices(matrix1, matrix2);
        if (difference != null) {
            displayMatrix(difference);
        }

		// Showing multiplication
        System.out.println("\nMultiplication:");
        int[][] product = multiplyMatrices(matrix1, matrix2);
        if (product != null) {
            displayMatrix(product);
        }

		// Finding transpose of matrix
        System.out.println("\nTranspose of Matrix 1:");
        int[][] transpose = transposeMatrix(matrix1);
        displayMatrix(transpose);

		// Determinant of matrix
        System.out.println("\nDeterminant of Matrix 1 (if 2x2):");
        if (rows == 2 && cols == 2) {
            System.out.println(determinant2x2(matrix1));
        } else if (rows == 3 && cols == 3) {
            System.out.println(determinant3x3(matrix1));
        } else {
            System.out.println("Determinant calculation is not supported for this matrix size.");
        }

		// Inverse of matrix
        System.out.println("\nInverse of Matrix 1 (if 2x2):");
        if (rows == 2 && cols == 2) {
            double[][] inverse = inverse2x2(matrix1);
            if (inverse != null) {
                for (double[] row : inverse) {
                    for (double element : row) {
                        System.out.printf("%.2f ", element);
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("Inverse calculation is not supported for this matrix size.");
        }
    }
	
	// Method for matrix creation
	public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }

	// Method for matrix addition
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices have incompatible dimensions for addition.");
            return null;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

	// Method for matrix substraction
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices have incompatible dimensions for subtraction.");
            return null;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

	// Method for matrix multiplication
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrices have incompatible dimensions for multiplication.");
            return null;
        }

        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
	
	// Method for matrix transpose
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
	
	// Method for matrix determinant2x2
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

	// Method for matrix determinant3x3
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

	// Method for matrix inverse2x2
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular. Inverse does not exist.");
            return null;
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = (double) matrix[1][1] / det;
        inverse[0][1] = -(double) matrix[0][1] / det;
        inverse[1][0] = -(double) matrix[1][0] / det;
        inverse[1][1] = (double) matrix[0][0] / det;
        return inverse;
    }

	// Printing the matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}