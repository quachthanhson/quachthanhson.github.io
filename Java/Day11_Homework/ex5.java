package Day11_Homework;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu họ tên: ");
        String input = scanner.nextLine();
        String formattedName = formatName(input);
        System.out.println("Biểu diễn mới: " + formattedName);
    }

    public static String formatName(String fullName) {
        String[] nameParts = fullName.trim().split("\\s+");
        int length = nameParts.length;

        if (length <= 1) {
            return fullName; // Không có đệm hoặc tên, không cần chuyển đổi
        }

        StringBuilder sb = new StringBuilder();
        sb.append(nameParts[length - 1]); // Tên

        for (int i = 0; i < length - 1; i++) {
            sb.append(" ").append(nameParts[i]); // Họ và đệm
        }

        return sb.toString();
    }
}
