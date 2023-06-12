package Day5_Homework;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của dãy số: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập dãy số: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countConsecutivePairs(arr);
        System.out.println("Số cặp phần tử liên tiếp bằng nhau trong dãy là: " + count);
    }

    public static int countConsecutivePairs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                if (i + 2 < arr.length && arr[i] == arr[i + 2]) {
                    count++;
                }
            }
        }
        return count;
    }
}
