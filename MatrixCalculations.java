/**
 *Program for Matrix addition, subtraction and multiplication.
 *
 *
 * @author Jayakrishnan V R
 * @version 1.0
 * @since 2020-11-27
 */


import java.util.Scanner;

//Class declaration
public class MatrixCalculations {

    public static void main(String... args) {
        int columns, rows;
        int[][] matrix1;
        int[][] matrix2;
        int[][] resultMatrix;
        Scanner sc = new Scanner(System.in);
        System.out.println("You can add , subtract or multiply 2 matrices");
        System.out.println("Press '+' for Addition and '-' for subtraction and '*' for multiplication");
        String choice = sc.nextLine();
        switch (choice) {
            case "+"://For adding matrices
                System.out.print("Enter number of rows in matrix : "); //rows and columns in matrix1 and matrix2 must be same for addition.
                rows = sc.nextInt();
                System.out.print("Enter number of columns in matrix : ");
                columns = sc.nextInt();
                matrix1 = new int[rows][columns];
                matrix2 = new int[rows][columns];

                System.out.println("Enter the elements in first matrix :");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrix1[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Enter the elements in second matrix :");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrix2[i][j] = sc.nextInt();
                    }
                }

                //addition of matrices.
                resultMatrix = new int[rows][columns];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }

                System.out.println("\nFirst matrix is : ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(matrix1[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nSecond matrix is : ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(matrix2[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nThe sum of the two matrices is : "); //Printing the answer
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(resultMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case "-"://For subtracting matrices
                System.out.print("Enter number of rows in matrix : "); //rows and columns in matrix1 and matrix2 must be same for subtraction.
                rows = sc.nextInt();
                System.out.print("Enter number of columns in matrix : ");
                columns = sc.nextInt();
                matrix1 = new int[rows][columns];
                matrix2 = new int[rows][columns];

                System.out.println("Enter the elements in first matrix :");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrix1[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Enter the elements in second matrix :");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrix2[i][j] = sc.nextInt();
                    }
                }

                //Subtraction of matrices.
                resultMatrix = new int[rows][columns];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                    }
                }

                System.out.println("\nFirst matrix is : ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(matrix1[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nSecond matrix is : ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(matrix2[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nThe subtraction of the two matrices is : ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(resultMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case "*"://For multiplying matrices
                System.out.print("Enter number of rows in first matrix : ");
                int rowsMatrix1 = sc.nextInt();
                System.out.print("Enter number of columns in first matrix / rows in matrix2: ");
                int columnsMatrix1RowsMatrix2 = sc.nextInt();         //variable name used for understanding convenience, because columns in matrix1 = rows in matrix2
                System.out.print("Enter number of columns in second matrix : ");
                int columnsMatrix2 = sc.nextInt();

                matrix1 = new int[rowsMatrix1][columnsMatrix1RowsMatrix2];
                matrix2 = new int[columnsMatrix1RowsMatrix2][columnsMatrix2];
                System.out.println("Enter the first matrix in elements :");
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix1[0].length; j++) {
                        matrix1[i][j] = sc.nextInt();
                    }
                }

                System.out.println("Enter the second matrix elements:");
                for (int i = 0; i < matrix2.length; i++) {
                    for (int j = 0; j < matrix2[0].length; j++) {
                        matrix2[i][j] = sc.nextInt();
                    }
                }


                //Multiply matrices
                resultMatrix = new int[rowsMatrix1][columnsMatrix2];
                for (int i = 0; i < rowsMatrix1; i++) {
                    for (int j = 0; j < columnsMatrix2; j++) {
                        for (int k = 0; k < columnsMatrix1RowsMatrix2; k++) { //columns in matrix1= rows in matrix2
                            resultMatrix[i][j] = resultMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }


                System.out.println("\nFirst matrix is : ");
                for (int i = 0; i < rowsMatrix1; i++) {
                    for (int j = 0; j < columnsMatrix1RowsMatrix2; j++) {
                        System.out.print(matrix1[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nSecond matrix is : ");
                for (int i = 0; i < columnsMatrix1RowsMatrix2; i++) {
                    for (int j = 0; j < columnsMatrix2; j++) {
                        System.out.print(matrix2[i][j] + " ");
                    }
                    System.out.println();
                }


                System.out.println("\nProduct of matrix1 and matrix2 is");
                for (int i = 0; i < rowsMatrix1; i++) {
                    for (int j = 0; j < columnsMatrix2; j++) {
                        System.out.print(resultMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            default://For handling invalid inputs
                System.out.println("Invalid input");
        }

    }

}

