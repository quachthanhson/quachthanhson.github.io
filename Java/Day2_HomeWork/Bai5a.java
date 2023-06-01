package Day2_HomeWork;

import java.util.Scanner;

public class Bai5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên và cuối cùng của ký tự đó trong chuỗi vừa nhập.\n");
        System.out.println("Nhập một chuỗi bất kì");
        String string1 = sc.nextLine();
        String[] characters = string1.split("");
        System.out.println("Nhập ký tự bất kỳ");
        String text = sc.nextLine();

        for (int i = 0; i < string1.length(); i++) {
            if (characters[i].equals(text)) {
                System.out.println("Vị trí xuất hiện đầu tiên là: " + (i + 1));
                break;
            }
        }

        for (int i = string1.length() - 1; i >= 0; i--) {
            if (characters[i].equals(text)) {
                System.out.println("Vị trí xuất hiện cuối cùng là: " + (i + 1));
                break;
            }
        }
    }
}

