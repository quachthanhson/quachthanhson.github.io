package Day11_Homework;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu chính (S1): ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập xâu con (S2): ");
        String s2 = scanner.nextLine();

        String result = removeSubstring(s1, s2);
        System.out.println("Kết quả: " + result);
    }

    public static String removeSubstring(String s1, String s2) {
        String modifiedString = s1;

        int index = modifiedString.indexOf(s2);
        while (index != -1) {
            modifiedString = modifiedString.substring(0, index) + modifiedString.substring(index + s2.length());
            index = modifiedString.indexOf(s2);
        }

        return modifiedString;
    }
}
