package Day11_Homework;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu ký tự: ");
        String input = scanner.nextLine();
        String result = normalizeString(input);
        System.out.println("Kết quả: " + result);
    }

    public static String normalizeString(String str) {
        String[] words = str.trim().split("\\s+"); // Loại bỏ dấu cách thừa và tách thành từng từ

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String remainingChars = word.substring(1).toLowerCase();
                sb.append(firstChar).append(remainingChars).append(" ");
            }
        }

        return sb.toString().trim();
    }
}

