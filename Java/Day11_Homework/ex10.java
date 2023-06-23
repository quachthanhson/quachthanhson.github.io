package Day11_Homework;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi S1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập chuỗi S2: ");
        String s2 = scanner.nextLine();

        String result = removeString(s1, s2);
        System.out.println("Kết quả: " + result);
    }

    public static String removeString(String s1, String s2) {
        String result = s2.replace(s1, "");
        return result;
    }
}
