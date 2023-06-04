package Day3_Homework;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập vào một số nguyên dương: ");
            number = scanner.nextInt();
        } while (number <= 0);

        int reversedNumber = 0;
        int remainder;
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        System.out.println("Số đã đảo ngược: " + reversedNumber);
    }
}
