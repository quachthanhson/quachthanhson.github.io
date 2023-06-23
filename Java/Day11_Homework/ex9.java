package Day11_Homework;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi S1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập chuỗi S2: ");
        String s2 = scanner.nextLine();
        System.out.print("Nhập vị trí k: ");
        int k = scanner.nextInt();

        String result = insertString(s1, s2, k);
        System.out.println("Kết quả: " + result);
    }

    public static String insertString(String s1, String s2, int k) {
        StringBuilder sb = new StringBuilder(s2);
        sb.insert(k, s1);
        return sb.toString();
    }
}
