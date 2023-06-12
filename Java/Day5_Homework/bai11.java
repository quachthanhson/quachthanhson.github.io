package Day5_Homework;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số dòng (n): ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột (m): ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Nhập ma trận:");
        inputMatrix(matrix, scanner);

        int max = findMaxValue(matrix);
        int min = findMinValue(matrix);

        System.out.println("Giá trị lớn nhất của ma trận: " + max);
        System.out.println("Giá trị nhỏ nhất của ma trận: " + min);
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

    public static int findMaxValue(int[][] matrix) {
        int max = matrix[0][0];
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    public static int findMinValue(int[][] matrix) {
        int min = matrix[0][0];
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }
}
