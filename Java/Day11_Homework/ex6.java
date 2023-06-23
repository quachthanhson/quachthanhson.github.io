package Day11_Homework;
import java.util.Arrays;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập câu: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");
        Arrays.sort(words);

        System.out.println("Các từ theo thứ tự alphabet:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}


