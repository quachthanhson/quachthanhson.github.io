package com.quachthanhson;

import java.util.Map;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Bài 4: Khai căn một số dương bất kì, kết quả làm tròn tới 3 chữ số thập phân.\n");

        Scanner sc = new Scanner(System.in);
        int m = 0;

        //kiểm tra giá trị nhập( Nếu giá trị âm thì nhập lại cho đến khi đúng)
        do{
            System.out.println("Nhập một số bất kì:");
            int n = sc.nextInt();
            m=n;
        }while (m<0);

        System.out.println("Đáp án: " +  Math.floor(Math.sqrt(m) * 1000 )/1000 );
    }
}
