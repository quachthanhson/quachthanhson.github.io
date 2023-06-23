package Day11_Homework;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi S1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập chuỗi S2: ");
        String s2 = scanner.nextLine();

        int position = findFirstOccurrence(s1, s2);
        System.out.println("Vị trí xuất hiện đầu tiên: " + position);
    }

    public static int findFirstOccurrence(String s1, String s2) {
        int position = s1.indexOf(s2);
        return position;
    }
}
