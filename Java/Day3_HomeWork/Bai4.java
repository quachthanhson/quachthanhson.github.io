import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên n và m từ người dùng
        System.out.print("Nhập giá trị của n: ");
        int n = scanner.nextInt();

        System.out.print("Nhập giá trị của m: ");
        int m = scanner.nextInt();

        // In hình chữ nhật rỗng
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}