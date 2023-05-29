package com.quachthanhson;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Bài 3: Tìm số lớn nhất trong 4 số biết trước.\n");
//Nhập giá trị
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        float n1 = sc.nextFloat();
        System.out.print("Nhập số thứ hai: ");
        float n2 = sc.nextFloat();
        System.out.print("Nhập số thứ ba: ");
        float n3 = sc.nextFloat();
        System.out.print("Nhập số thứ tư: ");
        float n4 = sc.nextFloat();
        float max = n1;
// so sánh
        if (n1< n2){
            max = n2;
        }
        if (n2< n3){
            max = n3;
        }
        if (n3< n4){
            max = n4;
        }
//in giá trị
        System.out.println("Giá trị lớn nhất trong 4 số là: " + max);

    }
}
