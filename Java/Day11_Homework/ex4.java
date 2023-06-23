package Day11_Homework;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu ký tự: ");
        String input = scanner.nextLine();
        String longestWord = findLongestWord(input);
        int position = findWordPosition(input, longestWord);

        System.out.println("Từ dài nhất: " + longestWord);
        System.out.println("Vị trí: " + position);
    }

    public static String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static int findWordPosition(String str, String word) {
        int position = str.indexOf(word);
        return position + 1; // +1 để chuyển từ vị trí dùng chỉ số từ 1 thay vì từ 0
    }
}
