package Day2_HomeWork;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài 3: Nhập vào chiều dài và chiều rộng của hình chữ nhật, tính chu vi và diện tích của hình chữ nhật đó.\n");
        System.out.println("Nhập cạnh thứ nhất của hình chữ nhật: ");
        float a = sc.nextFloat();
        System.out.println("Nhập cạnh thứ hai của hình chữ nhật: ");
        float b = sc.nextFloat();

        if ((a == 0) || (b == 0) || ((a == 0) && (b == 0))) {
            System.out.println("Đây không phải là hình chữ nhật");
        } else {
            System.out.println("Chu vi của hình chữ nhật là: " + (a + b) * 2);
            System.out.println("Diện tích của hình chữ nhật là: " + a * b);
        }
    }
}
