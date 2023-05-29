package com.quachthanhson;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài 5: Tìm thương của 2 số nguyên, làm tròn kết quả tới 3 chữ số thập phân. \n" );

        System.out.print("Nhập số bị chia: ");
        float sobichia = sc.nextFloat();
        System.out.print("Nhập số chia: ");
        float sochia = sc.nextFloat();

        if(sochia==0){
            System.out.println("Không có kết quả do số chia bằng 0");
        }else {
            float thuong = sobichia / sochia;
            System.out.println("Thương là: " + Math.floor(thuong * 1000 )/1000);
        }
    }
}
