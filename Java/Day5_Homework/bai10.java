package Day5_Homework;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị m: ");
        int m = scanner.nextInt();

        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();

        System.out.println("Các số chính phương trong đoạn [" + m + ", " + n + "]:");
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isPerfectSquare(i)) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Số lượng số chính phương trong đoạn [" + m + ", " + n + "]: " + count);
    }

    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}
