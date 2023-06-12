package Day5_Homework;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng (m) của ma trận A: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột (n) của ma trận A và số hàng của ma trận B: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột (k) của ma trận B: ");
        int k = scanner.nextInt();

        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[n][k];

        System.out.println("Nhập ma trận A:");
        inputMatrix(matrixA, scanner);

        System.out.println("Nhập ma trận B:");
        inputMatrix(matrixB, scanner);

        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        System.out.println("Kết quả tích của hai ma trận A và B là:");
        printMatrix(resultMatrix);
    }

    public static void inputMatrix(int[][] matrix, Scanner scanner) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        int k = matrixB[0].length;

        int[][] resultMatrix = new int[m][k];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                int sum = 0;
                for (int x = 0; x < n; x++) {
                    sum += matrixA[i][x] * matrixB[x][j];
                }
                resultMatrix[i][j] = sum;
            }
        }

        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
