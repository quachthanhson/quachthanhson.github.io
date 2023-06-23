package Day11_Homework;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu ký tự: ");
        String input = scanner.nextLine();
        String result = convertToAlternateCase(input);
        System.out.println("Kết quả: " + result);
    }

    public static String convertToAlternateCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }
}