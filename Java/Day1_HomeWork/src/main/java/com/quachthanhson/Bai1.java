package com.quachthanhson;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài 1: Tính chu vi và diện tích hình chữ nhật khi biết chiều dài và chiều rộng của chúng. \n" );

        System.out.print("Nhập cạnh thứ nhất của hình chữ nhật: ");
        float a = sc.nextFloat();

        System.out.print("Nhập cạnh thứ hai của hình chữ nhật: ");
        float b = sc.nextFloat();

        float P = (a+b) * 2;

        float S = a*b;

        System.out.println("Chu vi của hình chữ nhật là: " + P  );
        System.out.println("Diện tich của hình chữ nhật là: " + S  );
    }
}
