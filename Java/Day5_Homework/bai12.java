package Day5_Homework;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước ma trận vuông (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Nhập ma trận:");
        inputMatrix(matrix, scanner);

        int sum = calculateMainDiagonalSum(matrix);

        System.out.println("Tổng đường chéo chính của ma trận: " + sum);
    }

    public static void inputMatrix(int[][] matrix, Scanner scanner) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int calculateMainDiagonalSum(int[][] matrix) {
        int size = matrix.length;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
}
